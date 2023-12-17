package test;

public class PhoneWithCheapCamera {
    private CheapCamera cheapCamera;

    public PhoneWithCheapCamera(CheapCamera cheapCamera) {
        this.cheapCamera = cheapCamera;
    }

    @Override
    public String toString() {
        return "PhoneWithCheapCamera{" +
                "cheapCamera=" + cheapCamera +
                '}';
    }
}