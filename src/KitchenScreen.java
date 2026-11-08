public class KitchenScreen implements OrderObserver {

    // I use this method to update the kitchen when the order status changes
    @Override
    public void update(String status) {

        // Here I display the latest order status on the kitchen screen
        System.out.println("  Kitchen screen: " + status);
    }
}
