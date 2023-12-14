package homework.homework3.task2;

public class MotherBoard  {

    private final String name;
    private final int widthBoard;
    private final int heightBoard;
    private final int lengthBoard;

    public MotherBoard(String name, int widthBoard, int hightBoard, int lengthBoard) {
        this.name = name;
        this.widthBoard = widthBoard;
        this.heightBoard = hightBoard;
        this.lengthBoard = lengthBoard;
    }

    @Override
    public String toString() {
        return "Motherboard name: " + name + ", Motherboard size: "
                + widthBoard + "x" + heightBoard + "x" + lengthBoard + ",";
    }
}