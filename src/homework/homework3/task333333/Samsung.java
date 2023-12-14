package homework.homework3.task333333;

public class Samsung extends Phone {
    protected String model;


    public Samsung(String model) {
        this.model = model;
    }

    @Override
    public void assemblingSamsung(Samsung model, OperatingSystem operatingSystem, MotherBoard motherBoard, Camera camera) {
        super.assemblingSamsung(model, operatingSystem, motherBoard, camera);


    }

    @Override
    public String toString() {
        return "Samsung " + model + ",";

    }
}