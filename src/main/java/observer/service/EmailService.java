package observer.service;

import observer.Customer;
import observer.CustomerEvent;
import sun.print.CUPSPrinter;

import javax.annotation.Priority;
import javax.enterprise.event.Observes;

import static observer.CustomerEvent.Type.ADD;
import static observer.CustomerEvent.Type.REMOVE;

public class EmailService {
    public void sendWelcomeEmail(@Observes @Priority(10000) @CustomerEvent(ADD) Customer customer){
        //send welcome email
    }

    public void sendGoodbyeEmail(@Observes @CustomerEvent(REMOVE) Customer customer) {
        //send goodbye email
    }
}
