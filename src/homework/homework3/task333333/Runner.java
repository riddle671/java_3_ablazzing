package homework.homework3.task333333;

public class Runner {
    public static void main(String[] args) {
        Iphone model15 = new Iphone("15");
        Samsung galaxy = new Samsung("galaxy");
        PhoneFactory factory = new PhoneFactory();
        Motherboard motherboardSamsung = new Motherboard("j-108", "10х12х13");
        Motherboard motherboardIphone = new Motherboard("7uik", "15х12х13");
        Camera cameraSamsung = new Camera("20x", false);
        Camera cameraIphone = new Camera("15x", true);
        factory.assemblingSamsung(galaxy, "Android", motherboardSamsung, cameraSamsung);

        //Motherboard[] motherboards = new Motherboard[]{motherboardIphone, motherboardSamsung};
        //for (Motherboard motherboard : motherboards) {
            //factory.assemblingSamsung(galaxy, "Android", motherboard, "20x zoom");
            //factory.assemblingSamsung(model15, "Ios", motherboard, "15x zoom");
        //}


    }
}