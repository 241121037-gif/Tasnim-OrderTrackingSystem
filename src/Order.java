
import java.util.ArrayList;
import java.util.List;

public class Order {

    private String status;
    private final List<OrderObserver> observers;

    public Order() {
        // I set the starting status and create a list to keep my observers
        status = "Placed";
        observers = new ArrayList<>();
    }

    // I add an observer to the list if it is not already there
    public void addObserver(OrderObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    // I remove an observer when it no longer needs order updates
    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    // Here I update the order status whenever something changes
    public void setStatus(String newStatus) {
        // If the status is already the same, I don't need to update it
        if (status.equals(newStatus)) {
            return;
        }

        // I save the new status and display it on the screen
        status = newStatus;
        System.out.println("Order is now: " + status);

        // I notify everyone who is still registered for updates
        notifyObservers();
        System.out.println();
    }

    // This method sends the latest status to all my registered observers
    private void notifyObservers() {
        for (OrderObserver observer : new ArrayList<>(observers)) {
            observer.update(status);
        }
    }
}