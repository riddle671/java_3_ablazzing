package homework.homework3.task2;

public class Iphone extends Phone {

    protected String model;
    protected String operationSystem;

    @Override
    public void print(Iphone modelIphome, String operationSystem, String nameBoard, String sizeBoard, String zoomCamera, boolean flashCamera) {
        super.print(model, operationSystem, nameBoard, sizeBoard, zoomCamera , flashCamera);
        this.operationSystem = operationSystem;


    }

}


