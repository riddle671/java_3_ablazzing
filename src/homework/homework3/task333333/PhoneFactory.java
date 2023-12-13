package homework.homework3.task333333;

public class PhoneFactory {
    protected String factory;

    public void assemblingSamsung(Samsung model, String os, MotherBoard motherboard, Camera camera) {
        System.out.printf("%s OS: %s %s %s", model, os, motherboard, camera);
    }

    public void assemblingSamsung(Iphone model, String os, MotherBoard motherboard, Camera camera) {


    }
}