package com.sean.dojosNinjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sean.dojosNinjas.models.Dojo;
import com.sean.dojosNinjas.repositories.DojoRepo;

@Service
public class DojoService {
	
	@Autowired
	private DojoRepo dojoRepo;

	
	public List<Dojo> getAllDojos(){
		//Business logic
		return dojoRepo.findAll();
	}
	
	public void createDojo(Dojo dojo) {
		dojoRepo.save(dojo);
	}
	
	public void updateDojo(Dojo dojo) {
		dojoRepo.save(dojo);
	}
	
	public void deleteDojo(long id) {
		dojoRepo.deleteById(id);
	}
	
	public Dojo dojoDetails(long id) {
		return dojoRepo.findById(id).orElse(null);
		
	}
}
