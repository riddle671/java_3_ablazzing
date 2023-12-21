package homework.homework4.task2;

public class Duck implements Flyable {

    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    @Override
    public void fly() throws Flyexeption {
        if (isInjured) {
            throw new Flyexeption("Ошибка: утка ранена");
        }
        System.out.println("Утка летит");
    }
}
