package homework.homework3.task2;

public abstract class Phone extends PhoneFactory {

    @Override
    public void assemblingPhone(Samsung model, OperationSystems os, MotherBoard mb, Camera camera) {
        super.assemblingPhone(model, os, mb, camera);
    }

    @Override
    public void assemblingPhone(Iphone model, OperationSystems os, MotherBoard mb, Camera camera) {
        super.assemblingPhone(model, os, mb, camera);
    }
}