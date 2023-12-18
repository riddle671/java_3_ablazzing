package homework.homework3.task2;

public class MotherBoard  {

    private final String name;
    private final int width;
    private final int height;
    private final int length;

    public MotherBoard(String name, int widthBoard, int hightBoard, int lengthBoard) {
        this.name = name;
        this.width = widthBoard;
        this.height = hightBoard;
        this.length = lengthBoard;
    }

    @Override
    public String toString() {
        return "Motherboard name: " + name + ", Motherboard size: "
                + width + "x" + height + "x" + length + ",";
    }
}