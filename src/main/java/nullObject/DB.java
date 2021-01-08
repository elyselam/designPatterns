package nullObject;

import java.util.ArrayList;
import java.util.List;

public class DB {

    private List<String> customerNames;

    public DB() {
        this.customerNames = new ArrayList<>();
        this.customerNames.add("elyse");
        this.customerNames.add("butt");
        this.customerNames.add("face");
        this.customerNames.add("bacon");
    }
    public boolean existingCustomer(String name){
        for (String s: customerNames){
            if (s.equals(name)){
                return true;
            }
        }
        return false;
    }
}
