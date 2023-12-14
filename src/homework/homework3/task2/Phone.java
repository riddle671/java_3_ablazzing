package homework.homework3.task2;

public abstract class Phone extends PhoneFactory {
    @Override
    public void assemblingPhone(Samsung model, OperatingSystem operatingSystem, MotherBoard motherBoard, Camera camera) {
        super.assemblingPhone(model, operatingSystem, motherBoard, camera);
    }

    @Override
    public void assemblingPhone(Iphone model, OperatingSystem operatingSystem, MotherBoard motherboard, Camera camera) {
        super.assemblingPhone(model, operatingSystem, motherboard, camera);
    }
}