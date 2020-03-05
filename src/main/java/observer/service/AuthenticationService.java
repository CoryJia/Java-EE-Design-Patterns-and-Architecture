package observer.service;

import observer.Customer;
import observer.CustomerEvent;

import javax.annotation.Priority;
import javax.enterprise.event.Observes;

import static observer.CustomerEvent.Type.ADD;
import static observer.CustomerEvent.Type.REMOVE;

public class AuthenticationService {
    public void createAuthenticationCredentials(@Observes @Priority(100) @CustomerEvent(ADD) Customer customer) {
        // create authentication credentials
    }

    public void deleteAuthenticationCredentials(@Observes @CustomerEvent(REMOVE) Customer customer) {
        // delete authentication credentials
    }
}
