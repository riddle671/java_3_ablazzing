package homework.homework3.task333333;

public class Samsung extends Phone {
    protected String model;
    protected String os;


    public Samsung(String model) {
        this.model = model;
    }

    @Override
    public void assemblingSamsung(Samsung model, String os, MotherBoard motherboard, Camera camera) {
        super.assemblingSamsung(model, os, motherboard, camera);
        this.os = os;

    }

    @Override
    public String toString() {
        return "Samsung " + model + ",";

    }
}