package homework.homework3.task333333;

public abstract class Phone extends PhoneFactory {
    @Override
    public void assemblingSamsung(Samsung model, String os, Motherboard motherboard, String camera) {
        super.assemblingSamsung(model, os, motherboard, camera);
    }

    @Override
    public void assemblingSamsung(Iphone model, String os, Motherboard motherboard, String camera) {
        super.assemblingSamsung(model, os, motherboard, camera);
    }
}