package homework.homework4.task1;

public  class Passenger extends Car {

    private boolean hasCruiseControl;

    public Passenger(boolean clean, double width, double height, double length,
                     boolean hasCruiseControl) {
        super(clean, width, height, length);
        this.hasCruiseControl = hasCruiseControl;
    }
}
