package com.sean.bookClub.controllers;



import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sean.bookClub.models.LoginUser;
import com.sean.bookClub.models.User;
import com.sean.bookClub.services.BookService;
import com.sean.bookClub.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/")
	public String index(@ModelAttribute("newUser") User user, @ModelAttribute("newLogin") LoginUser loginUser) {
		return "index.jsp";
	}
	
	//Register a User
	@PostMapping("/registration")
	public String registerUser(@Valid @ModelAttribute("newUser") User user, BindingResult result, HttpSession session, @ModelAttribute("newLogin") LoginUser loginUser) {
		//Validate
		userService.validate(user, result);
		if(result.hasErrors()) {
			return "index.jsp";
		}
		//Register User
		userService.registerUser(user);
		//Put User in Session
		session.setAttribute("loggedInUser", user);
		return "redirect:/dashboard";
	}
	
	//Login
	@PostMapping("/login")
	public String loginUser(@Valid @ModelAttribute ("newLogin") LoginUser loginUser, BindingResult results, HttpSession session, @ModelAttribute("newUser") User user) {
	//Authenticate User
	userService.authenticateUser(loginUser, results);
	if(results.hasErrors()) {
		return "index.jsp";
	}
	User loggedInUser = userService.findByEmail(loginUser.getEmail());
	//Put User in Session
	session.setAttribute("loggedInUser", loggedInUser);
	return "redirect:/dashboard";
	}
	
	//Logout
	@GetMapping("/logout")
	public String logout(HttpSession session) {
			session.invalidate();
			return "redirect:/";
		}
	
	
	@GetMapping("/dashboard")
	public String dashboard(HttpSession session, Model bookModel) {
		//Check if User is in Session
		if(session.getAttribute("loggedInUser") != null) {
			bookModel.addAttribute("books", bookService.allBooks());
			return "dashboard.jsp";
		}
		else {
			return "redirect:/";
		}
	}
	
	
	
}
//	@GetMapping("/edit/student/{id}")
//	public String editStudent(@PathVariable long id, Model studentModel, Model model) {
//		User editStudent = UserService.studentDetails(id);
//		model.addAttribute("allDojos", DojoService.getAllDojos());
//		studentModel.addAttribute("editStudent", editStudent);
//		return "studentEdit.jsp";
//	}
//	
//	@PutMapping("/update/student/{id}")
//	public String updateStudent(@ModelAttribute("editStudent") User editedStudent, @PathVariable long id, BindingResult results) {
//		if(results.hasErrors()) {
//			return "studentNew.jsp";
//		}
//		UserService.updateStudent(editedStudent);
//		return "redirect:/student";
//	}
//	
//	@DeleteMapping("/delete/student/{id}")
//	public String deleteStudent(@PathVariable Long id) {
//		UserService.deleteStudent(id);
//		return "redirect:/student";
//	}
//	
//	@GetMapping("studentDetails/{id}")
//	public String studentDetails(@PathVariable Long id, Model studentModel) {
//		User student = UserService.studentDetails(id);
//		studentModel.addAttribute("student",student);
//		return "studentDetails.jsp";
//	}
//	

//	@GetMapping("/student")
//	public String index(Model studentModel) {
//		List<User> students = UserService.getAllStudents();
//		studentModel.addAttribute("allStudents", students);
//		return "studentIndex.jsp";
//	}

//	@GetMapping("/new/student")
//	public String newStudent(@ModelAttribute("newStudent") User newStudent, Model model) {
//		model.addAttribute("allDojos", DojoService.getAllDojos());
//		return "studentNew.jsp";
//	}

//	@PostMapping("/create/student")
//	public String createStudent(@Valid @ModelAttribute("newStudent") User newStudent, BindingResult results) {
//		if(results.hasErrors()) {
//			return "studentIndex.jsp";
//		}
//		UserService.createStudent(newStudent);
//		return "redirect:/student";
//	}