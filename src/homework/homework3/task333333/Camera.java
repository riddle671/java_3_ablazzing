package homework.homework3.task333333;

public class Camera extends Phone  {

    String zoom;
    boolean flash;

    public Camera(String zoom, boolean flash) {
        this.zoom = zoom;
        this.flash = flash;
    }

    @Override
    public String toString() {
        return ",Camera zoom: " + zoom + ", Camera flash: " + flash;
    }
}
