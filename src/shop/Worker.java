package shop;

import java.util.Arrays;

public class Worker {
    String name;
    int age;
    //boolean gender;
    Item[] veshi;

    public Worker(String name, int age, Item[] veshi) {
        this.name = name;
        this.age = age;
        //this.gender = gender;
        this.veshi = veshi;
    }
    public void krik (String name , Item fgh[]){
        this.name = name;
        this.veshi = fgh;
        System.out.println(name + " смотри какая у меня вещь " + fgh);
    }
}
