package facade;

import facade.subsystems.*;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class BankSystem {
    @EJB
    private CreditRatingService creditRatingService;

    @EJB
    private RepaymentPayabilityService repaymentPayabilityService;

    @EJB
    private InternalBankPolicyService internalBankPolicyService;

    @EJB
    private TransferService transferService;

    @EJB
    private RepaymentService repaymentService;

    public boolean processLoadApplication(Customer customer, Double principle, Double income, Integer months) {
        if (!creditRatingService.checkCustomerRating(customer))     return false;

        if (!repaymentPayabilityService.calculatePayability(principle, income, months)) return false;

        if (internalBankPolicyService.checkCompliance(customer)) return false;

        //Application successful, so transfer principe and set up repayment schedule
        transferService.makeTransfer(principle, customer);
        repaymentService.setUpPaymentSchedule(customer, principle,months);
        return true;
    }
}
