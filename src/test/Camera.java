package test;

public abstract class Camera {
    public int zoom;

    public Camera(int zoom) {
        this.zoom = zoom;
    }

    public int getZoom() {
        return zoom;
    }
}
