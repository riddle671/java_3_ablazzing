package homework.homework3.task2;

public class PhoneFactory {

    public void assemblingPhone(Samsung model, OperationSystems os, MotherBoard mb, Camera camera) {
        System.out.printf("%s %s %s %s\n", model, os, mb, camera);
    }

    public void assemblingPhone(Iphone model, OperationSystems os, MotherBoard mb, Camera camera) {
        System.out.printf("%s %s %s %s\n", model, os, mb, camera);
    }
}