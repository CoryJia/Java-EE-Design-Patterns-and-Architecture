package facade.subsystems;

import facade.Customer;
import javax.ejb.Stateless;

@Stateless
public class RepaymentService {
    public void setUpPaymentSchedule(Customer customer, Double principle, Integer months) {
        // set up monthly automatic payment from customer account to bank
    }
}