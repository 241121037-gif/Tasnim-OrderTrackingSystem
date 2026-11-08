public interface OrderObserver {

    // I use this method so each observer can receive the latest order status
    void update(String status);
}
