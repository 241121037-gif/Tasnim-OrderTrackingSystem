public class Main {

    public static void main(String[] args) {

        // I start by creating an order to track its status
        Order order = new Order();

        // Here I create two observers: Rahim's phone and the kitchen screen
        CustomerPhone customer = new CustomerPhone("Rahim");
        KitchenScreen kitchen = new KitchenScreen();

        // I add both observers so they receive updates about the order
        order.addObserver(customer);
        order.addObserver(kitchen);

        // The order is being prepared, so both observers get notified
        order.setStatus("Cooking");

        // The order is now on its way, and both observers receive an update
        order.setStatus("Out for delivery");

        // I remove the kitchen observer as it no longer needs updates
        order.removeObserver(kitchen);

        // The order has been delivered, so only Rahim gets notified
        order.setStatus("Delivered");
    }
}
