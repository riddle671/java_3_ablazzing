package homework.homework4.task1;

public class Bus extends Car {

    private int countPassagers;


    public Bus(boolean clean, double width, double height, double length, int countPassagers) {
        super(clean, width, height, length);
        this.countPassagers = countPassagers;
    }
}
