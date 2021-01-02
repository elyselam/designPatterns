package hospital;

import hospital.domain.Employee;

public class HospitalManagement {
    //now open for extensions and closed for modifications
    //Strategy Pattern: let diff employees perform different work
    public void callUpon(Employee emp) {
        emp.performDuties();
    }


}
