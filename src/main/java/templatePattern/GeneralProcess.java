package templatePattern;

public abstract class GeneralProcess {
    private String processName;

    public GeneralProcess(String processName) {
        this.processName = processName;
    }

    protected abstract void assembleDevice();
    protected abstract void testDevice();
    protected abstract void packageDevice();
    protected abstract void storeDevice();
    //Behavioral design pattern: defines the program's skeleton in the template method.
    //Template Pattern: defines general flow without getting into details
    // abstract workflows common in classes extending from this abstract class.
    //      abstract methods are implemented in the subclasses but are called in abstract class itself as part of a generally defined process


    //make sure process gets called in that order
    public void launchProcess() {
        if (processName != null && !processName.isEmpty()) {
            assembleDevice();
            testDevice();
            packageDevice();
            storeDevice();
        } else {
            System.out.println("no process name specified");
        }
    }
}
