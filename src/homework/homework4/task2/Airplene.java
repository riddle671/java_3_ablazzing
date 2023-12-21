package homework.homework4.task2;

public class Airplene implements Flyable {

    int countPassengers;

    public Airplene(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws Flyexeption {
        if (countPassengers < 0) {
            throw new Flyexeption("Ошибка: пассажиров в самолете меньше 0");
        }
        System.out.println("Самолет летит");
    }
}
