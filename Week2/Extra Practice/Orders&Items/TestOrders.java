
public class TestOrders {
    public static void main(String[] args) {
        
            // Menu items
            Item mocha = new Item();
            mocha.name = "mocha";
            mocha.price = 3.5;
            
            Item latte = new Item();
            latte.name = "latte";
            latte.price = 4.0;
            
            Item dripCoffee = new Item();
            dripCoffee.name = "dripCoffee";
            dripCoffee.price = 2.0;
    
            Item capuccino = new Item();
            capuccino.name = "capuccino";
            capuccino.price = 4.0;

            // Order variables -- order1, order2 etc.
            Order order1 = new Order();
            order1.name = "Cindhuri";
            order1.ready = true;
            order1.items.add(latte);
            order1.total = latte.price;

            Order order2 = new Order();
            order2.name = "Jimmy";
            order2.ready = false;
            order2.items.add(dripCoffee);
            order2.items.add(mocha);
            order2.total = (dripCoffee.price + mocha.price);


            Order order3 = new Order();
            order3.name = "Noah";
            order3.ready = true;
            order3.items.add(capuccino);
            order3.total = capuccino.price;

            Order order4 = new Order();
            order4.name = "Sam";
            order4.ready = false;
            order4.items.add(mocha);
            order4.total = mocha.price;





    
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("The order for %s will be %s.", order2.name, order2.total);
    }
}