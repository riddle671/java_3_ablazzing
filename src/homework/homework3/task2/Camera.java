package homework.homework3.task2;

public class Camera {

    private final String zoom;
    private final boolean flash;

    public Camera(String zoom, boolean flash) {
        this.zoom = zoom;
        this.flash = flash;
    }

    @Override
    public String toString() {
        return "Camera zoom: " + zoom + ", Camera flash: " + flash;
    }
}
