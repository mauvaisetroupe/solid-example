package solid._05_dependecyinjection.bad;
public class EmailNotifier {
    
    // The Dependency inversion principle: "Depend upon abstractions, [not] concretes."
    // BAD, we cannot change for another implementation without changing the code
    private GmailEmailSender emailSender;

    public EmailNotifier(GmailEmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void notify(String emailAddress, String message) {
        emailSender.sendEmail(emailAddress, message);
    }
}