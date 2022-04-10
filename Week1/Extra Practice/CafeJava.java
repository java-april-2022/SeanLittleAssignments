public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = "Your order will be ready shortly, ";
        String readyMessage = "Your order is ready, ";
        String displayTotalMessage = "Your total is $";
        String mistakeMessage = "Apolgies for the mistake, ";
        String newTotalMessage = "Your the difference will be $";
        
        // Menu variables 
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.5;
        double lattePrice = 4.5;
        double cappucinoPrice = 3.5;

        double MochaPrice = 3.5;
        double DripCoffeePrice = 2.5;
        double LattePrice = 4.5;
        double CappucinoPrice = 4.5;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";


    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isCorrectOrder = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println(readyMessage + customer1)
        System.out.println(displayTotalMessage + dripCoffeePrice)
    	// ** Your customer interaction print statements will go here ** //
        
        System.out.println(generalGreeting + customer2);
        if (isReadyOrder2) {
            System.out.println(readyMessage + customer2);
            System.out.println(displayTotalMessage + MochaPrice);
        }
        else {
            System.out.println(pendingMessage + customer2);
        }

        System.out.println(generalGreeting + customer3);
        if (isReadyOrder2) {
            System.out.println(readyMessage + customer3);
            System.out.println(displayTotalMessage + (DripCoffeePrice + LattePrice));
        }
        else {
            System.out.println(pendingMessage + customer3);
        }

        //Noah ordered a cappucino. 
        //Use an if statement to check the status of his order and print the correct status message. 
        //If it is ready, also print the message to display the total. 
        System.out.println(generalGreeting + customer4);
        if (isReadyOrder1) {
            System.out.println(pendingMessage + customer4);
        }
        else {
            System.out.println(readyMessage + customer3);
            System.out.println(displayTotalMessage + (DripCoffeePrice + LattePrice));
        }

        //Sam just ordered 2 lattes, print the message to display their total.
        //Next, use an if statement to print the appropriate order status message. 
        //Change the isReady flag value from true to false or vice versa in order to test your control logic (if-statement).
        System.out.println(generalGreeting + customer2);
        if (isReadyOrder2) {
            System.out.println(readyMessage + customer2);
            System.out.println(displayTotalMessage + (LattePrice * 2));
        }
        else {
            System.out.println(pendingMessage + customer2);
        }

        ///Jimmy just realized he was charged for a coffee but had ordered a latte. 
        ///Print the total message with the new calculated total (what he owes) to make up the difference.
        System.out.println(generalGreeting + customer3);
        if (isCorrectOrder) {
            System.out.println(mistakeMessage + customer2);
            System.out.println(newTotalMessage + (LattePrice - dripCoffeePrice));
        }
        else if (isReadyOrder1) {
            System.out.println(pendingMessage + customer2);
        }
        else {
            System.out.println(readyMessage + customer2;)
        }

    }

}
