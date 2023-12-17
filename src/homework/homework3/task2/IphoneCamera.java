package homework.homework3.task2;

public class IphoneCamera extends Camera {

    boolean flash;

    public IphoneCamera(String zoom, boolean flash) {
        super(zoom);
        this.flash = flash;
    }

    public boolean isFlash() {
        return true;
    }

    @Override
    public String toString() {
        return "IphoneCamera{" +
                "flash=" + flash +
                '}';
    }




}

