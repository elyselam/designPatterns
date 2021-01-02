package domainDao;

import domain.Employee;

public class EmployeeDao {
    public void saveEmployee(Employee emp){
//        DBConnectionManager connectionManager = DBConnectionManager.getConnectionInstance();
//        connectionManager.connect();
//        connectionManager.getConnectionObject().prepareStatement("insert into Emp_table");
//        connectionManager.disconnect();
        System.out.println("saved" + emp);

    }
    public void deleteEmployee(Employee emp){
        System.out.println("deleted");

    }
}