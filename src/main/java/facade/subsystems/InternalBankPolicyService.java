package facade.subsystems;


import facade.Customer;
import javax.ejb.Stateless;

@Stateless
public class InternalBankPolicyService {
    public boolean checkCompliance(Customer customer) {
        // Check that customer conforms to bank policy on lending
        return true;
    }
}