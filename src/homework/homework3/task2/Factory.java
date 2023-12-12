package homework.homework3.task2;

public class Factory {
    public void print(String modelIphone, String operationSystem, String nameBoard, String sizeBoard, String zoomCamera, boolean flashCamera) {

        //System.out.printf(" %s ос:%s материнка:%s камера: %s", model, os, motherboard, camera);

        System.out.println(" " + modelIphone + " " + operationSystem + " " + nameBoard + " " + sizeBoard + " " + zoomCamera + " " + flashCamera);

    }

    public void print(String modelSamsung, String operationSystem, String nameBoard, String sizeBoard, String zoomCamera) {


    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone();
        Samsung samsung1 = new Samsung();



    }
}

