package homework.homework3.task2;

public class PhoneFactory {

    Camera camera;



    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public void assemblingPhone(Samsung samsung) {
        OperationSystems operationSystemsSamsung = new OperationSystems("Android");
        MotherBoard motherBoardSamsungGalaxy = new MotherBoard("j-108", 10, 12, 13);
        //Camera cameraSamsung = new Camera();
        System.out.printf("%s %s %s %s\n", samsung, operationSystemsSamsung, motherBoardSamsungGalaxy);
    }

    public void assemblingPhone(Iphone iphone) {
        PhoneFactory factory = new PhoneFactory();
        //factory.getCamera().setZoom("11");
        //factory.getCamera().setFlash(false);
        OperationSystems operationSystemsIphone = new OperationSystems("IOS");
        MotherBoard motherBoardIphone15 = new MotherBoard("7uik", 15, 12, 13);
        System.out.printf("%s %s %s %s\n", iphone, operationSystemsIphone, motherBoardIphone15, factory.getCamera().getZoom());
    }

    public static void main(String[] args) {

        PhoneFactory factory = new PhoneFactory();
        Iphone iphone1 = new Iphone("madel15");
        //factory.assemblingPhone(iphone1);
        //factory.getCamera().setFlash(false);
        System.out.println(factory.getCamera().zoom);








    }
}