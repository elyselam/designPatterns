package hospital;

import hospital.domain.Employee;

public class Nurse extends Employee {

    public Nurse(int id, String name, String department, boolean working) {
        super(id, name, department, working);
    }

    @Override
    public void performDuties() {
        checkVitals();
    }

    private void checkVitals(){
        System.out.println("checking vitals");
    }

}
