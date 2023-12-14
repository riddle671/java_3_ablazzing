package homework.homework3.task333333;

public class Iphone extends Phone {
    protected String model;


    public Iphone(String model) {
        this.model = model;
    }

    @Override
    public void assemblingSamsung(Iphone model, OperatingSystem operatingSystem, MotherBoard motherboard, Camera camera) {
        super.assemblingSamsung(model, operatingSystem, motherboard, camera);

    }

    @Override
    public String toString() {
        return "Iphone " + model + ",";

    }




}