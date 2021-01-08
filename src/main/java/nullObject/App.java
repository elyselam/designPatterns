package nullObject;

/**
 * Null object:
 * good to avoid null references by:
 *          -return empty ArrayList
 *          -use if stmts to check if reference is null
 *
 * - create abstract class specifying operations to be done
 * - concrete classes extending from it
 * - null object class providing do nothing implementation
 */
public class App {
    public static void main(String[] args) {
        CustomerFactory customerFactory = new CustomerFactory();
        System.out.println(customerFactory.getCustomer("e").getCustomer());

        System.out.println(customerFactory.getCustomer("elyse").getCustomer());
    }
}
