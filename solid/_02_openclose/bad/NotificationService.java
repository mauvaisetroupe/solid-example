package solid._02_openclose.bad;

//https://medium.com/@javatechie/solid-design-principle-java-ae96a48db97
public class NotificationService{
    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        }
    }
}
