package observer;

import observer.order_update.CallCenter;
import observer.order_update.Customer;
import observer.order_update.DeliveryDriver;
import observer.order_update.Order;
import observer.order_update.Restaurant;

public class Main{
    public static void main(String[] args){
        //Create an order
        Order order=new Order(123);

        //Create customers,restaurant,callcenter and deliverydriver to track the order
        Customer customer=new Customer("Vishal Bhargav");
        Restaurant restaurant=new Restaurant("res 1");
        DeliveryDriver deliveryDriver=new DeliveryDriver("sagar karma");
        CallCenter callCenter=new CallCenter();

        //Attach observer to the order
        order.attach(customer);
        order.attach(restaurant);
        order.attach(deliveryDriver);
        order.attach(callCenter);

        //Simulate order status
        order.setStatus("Out for delivery");

        //Detach an observer (if needed)
        order.detach(callCenter);

        //Simulate more order status
        order.setStatus("Delivered");
    }
}