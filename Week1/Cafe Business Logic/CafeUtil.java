import java.util.ArrayList;

public class CafeUtil {
    
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] lineItems) {
        double sum = 0;
        for (int i = 0; i < lineItems.length; i++) {
            sum = sum + lineItems[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList <String> menuItems) {
        for (int i = 0; i <menuItems.size(); i++) {
            System.out.printf("%s %s \n", i, menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList <String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s!", userName);
        System.out.printf("There are %s customers in front of you. \n", customers.size());
        customers.add(userName);
        System.out.println(customers);
    }

    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.printf("%s", product);
        for (int i = 1; i < maxQuantity; i++) {
            System.out.printf("%s - $%.2f \n", i, i * price);
        }

    }
}