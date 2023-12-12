package homework.homework3.task2;

public abstract class Phone extends Factory {


    @Override
    public void print(String modelIphone, String operationSystem, String nameBoard, String sizeBoard, String zoomCamera, boolean flashCamera) {
        super.print(modelIphone, operationSystem, nameBoard, sizeBoard, zoomCamera, flashCamera);

    }

    @Override
    public void print(String modelSamsung, String operationSystem, String nameBoard, String sizeBoard, String zoomCamera) {
        super.print(modelSamsung, operationSystem, nameBoard, sizeBoard, zoomCamera);

    }

}