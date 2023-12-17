package homework.homework3.task2;

public class Iphone {

    private String model;

    public Iphone(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Iphone " + model + ",";
    }
}