package homework.homework3.task333333;

public class Samsung extends Phone {

    private String model;

    public Samsung(String model) {
        this.model = model;
    }

    @Override
    public void assemblingPhone(Samsung model, OperatingSystem operatingSystem, MotherBoard motherBoard, Camera camera) {
        super.assemblingPhone(model, operatingSystem, motherBoard, camera);
    }

    @Override
    public String toString() {
        return "Samsung " + model + ",";
    }
}