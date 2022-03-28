import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.text.DecimalFormat;

class CafeUtil {

    public static int getStreakGoal() {

        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    public static int getStreakGoal(int numWeeks) {

        int sum = 0;
        for (int i = 0; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    public static double getOrderTotal(double[] prices) {

        double sum = 0;
        for (double price : prices) {
            sum += price;
        }
        return sum;
    }

    public static void displayMenu(ArrayList<String> menuItems) {

        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(String.format("%d. %s", i, menuItems.get(i)));
        }
    }

    public static void addCustomer(ArrayList<String> customers) {

        System.out.println("Por favor, ingresa tu nombre:");
        String userName = System.console().readLine();
        System.out.println(String.format("¡Hola, %s!", userName));
        System.out.println(String.format("Hay %d personas frente a ti", customers.size()));
        customers.add(userName);
        for (String customer : customers) {
            System.out.println(customer);
        }
    }

    public static void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        for (int i = 1; i <= maxQuantity; i++) {
            DecimalFormat myFormatter = new DecimalFormat("$###,###.###");
            String value = myFormatter.format(i * price);
            System.out.println(String.format("%d - %d", i, value));
        }
    }

}