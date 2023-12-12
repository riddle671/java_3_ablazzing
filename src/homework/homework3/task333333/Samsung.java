package homework.homework3.task333333;

public class Samsung extends Phone {
    protected String model;
    protected String os;
    protected Motherboard motherboard;
    protected String camera;

    public Samsung(String model) {
        this.model = model;
    }

    @Override
    public void assemblingSamsung(Samsung model, String os, Motherboard motherboard, String camera) {
        super.assemblingSamsung(model, os, motherboard, camera);
        this.os = os;
        this.motherboard = motherboard;
        this.camera = camera;
    }
}