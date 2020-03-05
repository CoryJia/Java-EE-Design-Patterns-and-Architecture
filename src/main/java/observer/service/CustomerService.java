package observer.service;

import observer.Customer;
import observer.CustomerEvent;

import javax.annotation.Priority;
import javax.enterprise.event.Observes;
import javax.enterprise.event.ObservesAsync;

import static observer.CustomerEvent.Type.ADD;
import static observer.CustomerEvent.Type.REMOVE;

public class CustomerService {
    public void createCustomer(@ObservesAsync @Priority(10) @CustomerEvent(ADD) Customer customer) {
        //add new customer
    }

    public void deleteCustomer(@ObservesAsync @CustomerEvent(REMOVE) Customer customer) {
        //delete customer
    }
}
