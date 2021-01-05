package interfaceSegregation;

public class ReportGenerator {

    private Reporting transactionObj;

    public void generateReport() {
        System.out.println(transactionObj.getDate()+" "+transactionObj.productBreakDown() + " " + transactionObj.getName());
    }
}
