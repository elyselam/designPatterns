package templatePattern;

public class PhoneManufacturing extends GeneralProcess{

    public PhoneManufacturing(String processName) {
        super(processName);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("assemble");

    }

    @Override
    protected void testDevice() {
        System.out.println("tested");

    }

    @Override
    protected void packageDevice() {
        System.out.println("package");

    }

    @Override
    protected void storeDevice() {
        System.out.println("store");

    }
}
