package nullObject;

public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getCustomer() {
//        return null;
        return "no customer in DB";

    }
}
