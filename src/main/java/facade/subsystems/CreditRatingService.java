package facade.subsystems;

import facade.Customer;
import javax.ejb.Stateless;

@Stateless
public class CreditRatingService {
    public boolean checkCustomerRating(Customer customer) {
        Integer rating = 900; // Connect to external credit reference agency
        return rating > 700;
    }
}