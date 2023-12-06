package shop;
import java.util.Arrays;
public class Worker {
    String name;
    int age;
    String gender;
    Item[] veshi;

    public Worker(String name, int age, String gender, Item[] veshi) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.veshi = veshi;
    }
    public void krik (String name, Item items[]){
        for (Item ghj : items)
        System.out.println(name + " смотри какая у меня вещь " + ghj);
    }
}