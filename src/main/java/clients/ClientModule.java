package clients;
import domain.Employee;
import domainDao.EmployeeDao;
import reporting.EmployeeReportFormatter;
import reporting.FormatType;

public class ClientModule {

    public static void main(String[] args) {
        Employee e = new Employee(1, "e", "sales", true);

        ClientModule.hireNewEmployee(e);
        printEmpReport(e);

    }
    public static void hireNewEmployee(Employee emp){
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.saveEmployee(emp);
    }
    public static void terminatedEmployee(Employee emp) {
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.deleteEmployee(emp);
    }
    public static void printEmpReport(Employee emp){
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(emp, FormatType.CSV);
        System.out.println(formatter.getFormattedEmployee());
    }
}