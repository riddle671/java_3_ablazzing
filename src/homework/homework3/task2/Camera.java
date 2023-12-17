package homework.homework3.task2;

public abstract class Camera {

    protected String zoom;

    public Camera(String zoom) {
        this.zoom = zoom;
    }

    public String getZoom() {
        return zoom;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "zoom='" + zoom + '\'' +
                '}';
    }
}
