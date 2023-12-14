package homework.homework3.task333333;

public class Runner {

    public static void main(String[] args) {
        Iphone iphone15 = new Iphone("15");
        Samsung sasmunGagalaxy = new Samsung("galaxy");
        OperatingSystem operatingSystemSamsung = new OperatingSystem("Android");
        OperatingSystem operatingSystemIphone = new OperatingSystem("IOS");
        MotherBoard motherBoardSamsunggalaxy = new MotherBoard("j-108", 10, 12, 13);
        MotherBoard motherBoardIphone15 = new MotherBoard("7uik", 15, 12, 13);
        Camera cameraSamsung = new Camera("20x", false);
        Camera cameraIphone = new Camera("15x", true);
        PhoneFactory factory = new PhoneFactory();
        factory.assemblingPhone(sasmunGagalaxy, operatingSystemSamsung, motherBoardSamsunggalaxy, cameraSamsung);
        factory.assemblingPhone(iphone15, operatingSystemIphone, motherBoardIphone15, cameraIphone);
    }
}

