package homework.homework3.task2;

public class PhoneFactory {

    public void assemblingPhone(Samsung model, OperatingSystem operatingSystem, MotherBoard motherBoard, Camera camera) {
        System.out.printf("%s %s %s %s\n", model, operatingSystem, motherBoard, camera);
    }

    public void assemblingPhone(Iphone model, OperatingSystem operatingSystem, MotherBoard motherBoard, Camera camera) {
        System.out.printf("%s %s %s %s\n", model, operatingSystem, motherBoard, camera);
    }
}