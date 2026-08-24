package Coupling.looseCoupling;

public class OrderService {
    
    NotificationService notificationService;

    public OrderService(NotificationService notificationService){
        this.notificationService = notificationService;
    }
    //Here we don't specify whether we need an email object or sms object.
    //We just take the object from outside the service class and use its implementation.

    
    public void placeOrder(){
        notificationService.send("Order Placed");
    }
}
