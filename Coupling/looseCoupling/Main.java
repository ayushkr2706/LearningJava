package Coupling.looseCoupling;


public class Main {
    public static void main(String[] args) {
        
        NotificationService email = new EmailService();
        NotificationService sms = new SmsService();

        OrderService orderService = new OrderService(email);
        orderService.placeOrder();

    }
    
}
