package homework.homework3.task333333;

public class Iphone extends Phone {
    protected String model;
    protected String os;
    protected Motherboard motherboard;
    protected String camera;


    public Iphone(String model) {
        this.model = model;
    }

    @Override
    public void assemblingSamsung(Iphone model, String os, Motherboard motherboard, String camera) {
        super.assemblingSamsung(model, os, motherboard, camera);
        this.os = os;
        this.motherboard = motherboard;
        this.camera = camera;
    }
}