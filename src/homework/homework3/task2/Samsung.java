package homework.homework3.task2;

public class Samsung extends Phone {

    private final String model;

    public Samsung(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Samsung " + model + ",";
    }
}