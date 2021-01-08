package nullObject;

public class CustomerFactory {
    private DB db;

    public CustomerFactory() {
        this.db = new DB();
    }

    public AbstractCustomer getCustomer(String name) {
        if (checkName(name)){
            return new RealCustomer(name);
        }
        return new NullCustomer();
    }

    private boolean checkName(String name) {
        if (db.existingCustomer(name)){
            return true;
        }
        return false;
    }

}
