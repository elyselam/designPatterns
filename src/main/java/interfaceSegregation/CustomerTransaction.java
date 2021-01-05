package interfaceSegregation;

import java.util.Date;
import java.util.List;

public class CustomerTransaction implements Accounting, Reporting {


    private List<Product> products;
    private Customer customer;

    public CustomerTransaction(Customer customer, List<Product> products) {
        this.products = products;
        this.customer = customer;
    }

    @Override
    public String getName() {
        return "name";
    }
    @Override
    public Date getDate(){
        return new Date();
    }

    @Override
    public String productBreakDown(){
        String reportListing = null;
        for (Product product: products) {
            reportListing += product.getProductName();
        }
        return reportListing;

    }

    @Override
    public void chargeCustomer() {
        System.out.println("charging");
    }

    @Override
    public void prepareInvoice() {
        System.out.println("preparing");
    }
}