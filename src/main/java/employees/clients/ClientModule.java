package employees.clients;
import employees.domain.Employee;
import employees.domainDao.EmployeeDao;
import employees.reporting.EmployeeReportFormatter;
import employees.reporting.FormatType;

public class ClientModule {

    public static void main(String[] args) {
        Employee e = new Employee(1, "e", "sales", true);

        ClientModule.hireNewEmployee(e);
        printEmpReport(e, FormatType.CSV);

    }
    public static void hireNewEmployee(Employee emp){
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.saveEmployee(emp);
    }
    public static void terminatedEmployee(Employee emp) {
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.deleteEmployee(emp);
    }
    public static void printEmpReport(Employee emp, FormatType formatType){
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(emp, formatType);
        System.out.println(formatter.getFormattedEmployee());
    }


}