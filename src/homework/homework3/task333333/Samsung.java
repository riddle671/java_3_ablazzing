package homework.homework3.task333333;

public class Samsung extends Phone {
    protected String model;
    protected String os;
    protected Motherboard motherboard;


    public Samsung(String model) {
        this.model = model;
    }

    @Override
    public void assemblingSamsung(Samsung model, String os, Motherboard motherboard, Camera camera) {
        super.assemblingSamsung(model, os, motherboard, camera);
        this.os = os;
        this.motherboard = motherboard;

    }

    @Override
    public String toString() {
        return "Samsung{" +
                "model='" + model;
    }
}