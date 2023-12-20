package homework.homework4.task2;

public class Runner {

    public static void main(String[] args) throws Flyexeption {

        Duck duck1 = new Duck(false);
        Duck duck2 = new Duck(true);
        Airplene airplene1 = new Airplene(10);
        Airplene airplene2 = new Airplene(-1);

        try {
            duck1.fly();
        } catch (Flyexeption flyexeption) {
            System.out.println("Ошибка: утка ранена");
        }
        try {
            duck2.fly();
        } catch (Flyexeption flyexeption) {
            System.out.println("Ошибка: утка ранена");
        }

        try {
            airplene1.fly();
        } catch (Flyexeption flyexeption) {
            System.out.println("пассажиров в самолете меньше 0");
        }

        try {
            airplene2.fly();
        } catch (Flyexeption flyexeption) {
            System.out.println("пассажиров в самолете меньше 0");
        }


    }
}
