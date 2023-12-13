package homework.homework3.task333333;

public class Runner {
    public static void main(String[] args) {
        Iphone model15 = new Iphone("15");
        Samsung galaxy = new Samsung("galaxy");
        PhoneFactory factory = new PhoneFactory();
        MotherBoard motherBoardSamsung = new MotherBoard("j-108", "10х12х13");
        MotherBoard motherBoardIphone = new MotherBoard("7uik", "15х12х13");
        Camera cameraSamsung = new Camera("20x", false);
        Camera cameraIphone = new Camera("15x", true);
        MotherBoard[] motherboards = new MotherBoard[]{motherBoardIphone, motherBoardSamsung};
        for (MotherBoard motherboard : motherboards) {
            //factory.assemblingSamsung(galaxy, "Android", motherboard, cameraSamsung);
            //factory.assemblingSamsung(model15, "Ios", motherboard, cameraIphone);
        }
        factory.assemblingSamsung(galaxy, "Android", motherBoardSamsung, cameraSamsung);
        factory.assemblingSamsung(model15, "Ios", motherBoardIphone, cameraIphone);


    }
}