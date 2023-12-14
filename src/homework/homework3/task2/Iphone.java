package homework.homework3.task2;

public class Iphone extends Phone {

    private String model;

    public Iphone(String model) {
        this.model = model;
    }

    @Override
    public void assemblingPhone(Iphone model, OperatingSystem operatingSystem, MotherBoard motherboard, Camera camera) {
        super.assemblingPhone(model, operatingSystem, motherboard, camera);
    }

    @Override
    public String toString() {
        return "Iphone " + model + ",";
    }
}