package test;

public class ExpensiveCamera extends Camera {
    public ExpensiveCamera() {
        super(8);
    }

    public void makeShot() {
        System.out.println("сделать снимок");
    }
}
