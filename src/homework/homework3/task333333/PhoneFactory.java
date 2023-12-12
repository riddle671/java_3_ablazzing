package homework.homework3.task333333;

public class PhoneFactory {
    protected String factory;

    public void assemblingSamsung(Samsung model, String os, Motherboard motherboard, String camera) {
        System.out.printf("%s ос:%s материнка:%s камера: %s", model, os, motherboard, camera);
    }

    public void assemblingSamsung(Iphone model, String os, Motherboard motherboard, String camera) {


    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("fg");

        iphone1.assemblingSamsung();
    }
}