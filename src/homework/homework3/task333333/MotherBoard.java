package homework.homework3.task333333;

public class MotherBoard extends Phone {
    protected String name;
    protected String size;

    public MotherBoard(String name, String size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return ",Motherboard name: " + name + ", Motherboard size: " + size;
    }
}