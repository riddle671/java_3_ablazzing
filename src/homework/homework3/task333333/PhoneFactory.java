package homework.homework3.task333333;

public class PhoneFactory {
    protected String factory;

    public void assemblingSamsung(Samsung model, OperatingSystem operatingSystem, MotherBoard motherBoard, Camera camera) {
        //System.out.printf("%s OS: %s %s %s" model, operatingSystem);
        System.out.printf("%s %s %s %s\n", model, operatingSystem, motherBoard, camera);
        //System.out.println(model);
        //System.out.println(operatingSystem);

    }

    public void assemblingSamsung(Iphone model, OperatingSystem operatingSystem, MotherBoard motherBoard, Camera camera) {
        System.out.printf("%s %s %s %s\n", model, operatingSystem, motherBoard, camera);
    }
}