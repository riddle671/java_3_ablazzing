package shop;
import java.util.Arrays;
public class Worker {
    String name;
    int age;
    String gender;
    Item[] listThings;

    public Worker(String name, int age, String gender, Item[] listThings) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.listThings = listThings;
    }

    public String toString() {
        return name + ": " + age + " лет, " + gender + ", список вещей: " + Arrays.toString(listThings);
    }
    public void boasting (String name, Item items[]){
        for (Item count : items)
        System.out.println(name + " смотри какая у меня вещь " + count);
    }
}