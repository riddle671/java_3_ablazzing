package homework.homework4.task1;

public abstract class Car {

    private boolean chist;
    private int width;
    private int height;
    private int length;


    public Car(boolean chist, int shirin, int height, int length) {
        this.chist = chist;
        this.width = shirin;
        this.height = height;
        this.length = length;
    }

    public boolean isChist() {
        return chist;
    }

    public void setChist(boolean chist) {
        this.chist = chist;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}



