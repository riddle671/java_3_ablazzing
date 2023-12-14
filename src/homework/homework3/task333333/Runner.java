package homework.homework3.task333333;

public class Runner {
    public static void main(String[] args) {
        Iphone iphone15 = new Iphone("15");
        Samsung sasmungagalaxy = new Samsung("galaxy");
        OperatingSystem operatingSystemSamsung = new OperatingSystem("Android");
        OperatingSystem operatingSystemIphone = new OperatingSystem("IOS");
        MotherBoard motherBoardSamsunggalaxy = new MotherBoard("j-108", "10х12х13");
        MotherBoard motherBoardIphone15 = new MotherBoard("7uik", "15х12х13");
        Camera cameraSamsung = new Camera("20x", false);
        Camera cameraIphone = new Camera("15x", true);
        PhoneFactory factory = new PhoneFactory();
        factory.assemblingSamsung(sasmungagalaxy, operatingSystemSamsung, motherBoardSamsunggalaxy, cameraSamsung);
        factory.assemblingSamsung(iphone15, operatingSystemIphone, motherBoardIphone15, cameraIphone);
    }
}

