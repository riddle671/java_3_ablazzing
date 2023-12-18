package homework.homework4.task1;

public abstract class Car {

    private boolean clean;
    private double width;
    private double height;
    private double length;


    public Car(boolean clean, double width, double height, double length) {
        this.clean = clean;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}



