package observer.order_update;

public class DeliveryDriver implements Observer {
    private String driverName;

    public DeliveryDriver(String name) {
        this.driverName = name;
    }
    @Override
    public void update(Order order) {
        System.out.println("Driver " + driverName + ": Order #" + order.getId() + " is now " + order.getStatus() + ".");
    }
}

