package homework.homework3.task333333;

public class MotherBoard  {

    private String name;
    private int widthBoard;
    private int hightBoard;
    private int lengthBoard;

    public MotherBoard(String name, int widthBoard, int hightBoard, int lengthBoard ) {
        this.name = name;
        this.widthBoard = widthBoard;
        this.hightBoard = hightBoard;
        this.lengthBoard = lengthBoard;
    }

    @Override
    public String toString() {
        return "Motherboard name: " + name + ", Motherboard size: "
                + widthBoard + "x" + hightBoard + "x" + lengthBoard + ",";
    }
}