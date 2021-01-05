package interfaceSegregation;

public class AccountsRec {

    private Accounting transactionObj;

    public AccountsRec(Accounting transactionObj) {
        this.transactionObj = transactionObj;
    }

    public void postPayment(){
        transactionObj.chargeCustomer();
    }
    public void sendInvoice() {
        transactionObj.prepareInvoice();

    }
}
