package homework.homework3.task2;

public class Iphone extends Phone {

    private final String model;

    public Iphone(String model) {
        this.model = model;
    }

    @Override
    public void assemblingPhone(Iphone model, OperationSystems os, MotherBoard mb, Camera camera) {
        super.assemblingPhone(model, os, mb, camera);
    }

    @Override
    public String toString() {
        return "Iphone " + model + ",";
    }
}