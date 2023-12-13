package homework.homework3.task333333;

public class Motherboard extends Phone {
    protected String name;
    protected String size;

    public Motherboard(String name, String size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}