package homework.homework3.task2;

public class OperationSystems {

    private final String osName;

    public OperationSystems(String osName) {
        this.osName = osName;
    }

    @Override
    public String toString() {
        return "OS: " + osName + ",";
    }
}
