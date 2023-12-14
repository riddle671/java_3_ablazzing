package homework.homework3.task333333;

public class OperatingSystem {

    private String osName;

    public OperatingSystem(String osName) {
        this.osName = osName;
    }

    @Override
    public String toString() {
        return "OS: " + osName + ",";
    }
}
