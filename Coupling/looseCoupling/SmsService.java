package Coupling.looseCoupling;

public class SmsService implements NotificationService {

    public void send(String message){
        System.out.println("Sms message : " + message);
    }
    
}
