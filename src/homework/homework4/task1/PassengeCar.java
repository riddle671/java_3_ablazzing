package homework.homework4.task1;

public  class PassengeCar extends Car {

    boolean cruiseControl;

    public PassengeCar(boolean chist, int shirin, int visot, int glubin, boolean cruiseControl) {
        super(chist, shirin, visot, glubin);
        this.cruiseControl = cruiseControl;
    }

}
