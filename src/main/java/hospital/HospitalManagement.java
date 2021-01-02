package hospital;

import hospital.domain.Employee;

public class HospitalManagement {

    public void callUpon(Employee emp) {
        if (emp instanceof Nurse) {
            checkVitals();
        } else if (emp instanceof Doctor) {
            prescribeMeds();
        }
    }
    private void checkVitals(){
        System.out.println("checking vitals");
    }
    private void prescribeMeds(){
        System.out.println("prescribing");
    }
}
