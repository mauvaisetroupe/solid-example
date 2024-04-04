package solid._05_dependecyinjection.good;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        EmailSender emailSender = new GmailEmailSender();
        // INJECT DFEPENDENCY
        EmailNotifier emailNotifier = new EmailNotifier(emailSender);
        emailNotifier.notify(null, null); 

        List toto = new ArrayList<>();
        
    }
}
