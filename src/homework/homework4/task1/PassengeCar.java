package homework.homework4.task1;

public  class PassengeCar extends Car {

    private boolean cruiseControl;

    public PassengeCar(boolean clean, double width, double height, double length, boolean cruiseControl) {
        super(clean, width, height, length);
        this.cruiseControl = cruiseControl;
    }
}
