package employees.reporting;

public class ReportFormatter {

    String formattedOutput;

    public ReportFormatter(Object obj, FormatType formatType) {

        switch (formatType) {
            case XML:
                formattedOutput = convertObjectToXML(obj);
                break;
            case CSV:
                formattedOutput = convertObjectToCVS(obj);
                break;
        }
    }

    private String convertObjectToXML(Object obj) {
        return "XML: <title>" + obj.toString() + "</title>";
    }

    private String convertObjectToCVS(Object obj) {
        return "CSV : ,,," + obj.toString() + ",,,";
    }

    protected String getFormattedValue() {
        return formattedOutput;

    }
}
