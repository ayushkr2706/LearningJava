package Coupling.tightCoupling;

public class OrderService {

    EmailService emailService = new EmailService();
    SmsService smsService = new SmsService();
    WhatsappService whatsappService = new WhatsappService();
    //If we want any other service to send the message, we have to create the object of that service in this class. 
    // This is tight coupling.

    public void placeOrder(){
        
        emailService.sendMessage("Order Placed");
    }
    
}
