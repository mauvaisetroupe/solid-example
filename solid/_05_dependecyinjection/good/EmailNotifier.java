package solid._05_dependecyinjection.good;

public class EmailNotifier {
    
    // The Dependency inversion principle: "Depend upon abstractions, [not] concretes."
    // GOOD, we can change for another implementation without changing the code
    // NO DEPENDENCE WITH GMAIL
    private EmailSender emailSender;

    public EmailNotifier(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void notify(String emailAddress, String message) {
        emailSender.sendEmail(emailAddress, message);
    }
}