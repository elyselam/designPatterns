package reporting;

import domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter {

    public EmployeeReportFormatter(Employee emp, FormatType formatType) {
        super(emp, formatType);
    }

    public String getFormattedEmployee() {
        return getFormattedValue();
    }








}
