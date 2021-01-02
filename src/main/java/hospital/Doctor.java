package hospital;

import hospital.domain.Employee;

public class Doctor extends Employee {
    public Doctor(int id, String name, String department, boolean working) {
        super(id, name, department, working);
    }

    @Override
    public void performDuties() {
        prescribeMeds();
    }

    private void prescribeMeds(){
        System.out.println("prescribing");
    }
}
