public class CustomerPhone implements OrderObserver {

    private final String customerName;

    // I use this constructor to store the customer's name
    public CustomerPhone(String customerName) {
        this.customerName = customerName;
    }

    // Here I update the customer whenever the order status changes
    @Override
    public void update(String status) {

        // I display an SMS message with the customer's name and latest status
        System.out.println(
                "  SMS to " + customerName
                        + ": Your order is now " + status
        );
    }
}
