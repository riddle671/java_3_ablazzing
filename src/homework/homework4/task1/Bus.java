package homework.homework4.task1;

public class Bus extends Car {

    private int maxPassengers;

    public Bus(boolean clean, double width, double height, double length, int maxPassengers) {
        super(clean, width, height, length);
        this.maxPassengers = maxPassengers;
    }
}
