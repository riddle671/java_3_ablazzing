package homework.homework4.task1;

public abstract class Car {

    boolean chist;
    int shirin;
    int visot;
    int dlin;

    public Car(boolean chist, int shirin, int visot, int dlin) {
        this.chist = chist;
        this.shirin = shirin;
        this.visot = visot;
        this.dlin = dlin;
    }

    public boolean isChist() {
        return chist;
    }

    public void setChist(boolean chist) {
        this.chist = chist;
    }

    public int getShirin() {
        return shirin;
    }

    public void setShirin(int shirin) {
        this.shirin = shirin;
    }

    public int getVisot() {
        return visot;
    }

    public void setVisot(int visot) {
        this.visot = visot;
    }

    public int getDlin() {
        return dlin;
    }

    public void setGlubin(int dlin) {
        this.dlin = dlin;
    }
}
