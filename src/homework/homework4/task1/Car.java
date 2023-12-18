package homework.homework4.task1;

public abstract class Car {

    boolean chist;
    int width;
    int height;
    int length;
    Car krupn;
    Car melk;

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

    public int getShirin() {
        return width;
    }

    public void setShirin(int shirin) {
        this.width = shirin;
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

    public void setGlubin(int dlin) {
        this.length = dlin;
    }
}
