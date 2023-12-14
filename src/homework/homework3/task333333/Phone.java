package homework.homework3.task333333;

public abstract class Phone extends PhoneFactory {
    @Override
    public void assemblingSamsung(Samsung model, OperatingSystem operatingSystem, MotherBoard motherBoard, Camera camera) {
        super.assemblingSamsung(model, operatingSystem, motherBoard, camera);
    }

    @Override
    public void assemblingSamsung(Iphone model, OperatingSystem operatingSystem, MotherBoard motherboard, Camera camera) {
        super.assemblingSamsung(model, operatingSystem, motherboard, camera);
    }

}