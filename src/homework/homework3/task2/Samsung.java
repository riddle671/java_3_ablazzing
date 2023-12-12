package homework.homework3.task2;

public class Samsung extends Phone {

    protected String model;
    protected String operationSystem;

    @Override
    public void print(String modelSamsung, String operationSystem,
                      String nameBoard, String sizeBoard, String zoomCamera, boolean flashCamera) {
        super.print(modelSamsung, operationSystem, nameBoard, sizeBoard, zoomCamera, flashCamera);
        this.model = modelSamsung;
        this.operationSystem = operationSystem;


    }



}
