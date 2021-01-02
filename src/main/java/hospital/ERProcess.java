package hospital;

import hospital.domain.Employee;

public class ERProcess {
    public static void main(String[] args) {
        HospitalManagement ERDirector = new HospitalManagement();
        Employee e = new Nurse(1, "e", "ER", true);
        ERDirector.callUpon(e);

    }
}
