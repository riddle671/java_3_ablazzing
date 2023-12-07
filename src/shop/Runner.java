package shop;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Item Hammer = new Item("молоток", 1000);
        Item Screwdriver = new Item("отвертка", 50);
        Item Notebook = new Item("тетрадка",30);
        Item Pen = new Item("ручка", 10);

        Item[] setThings1 = {Hammer, Screwdriver};
        Item[] setThings2 = {Notebook, Pen};

        Worker worker1 = new Worker("Василий", 30, "мужчина", setThings1 );
        Worker worker2 = new Worker("Марьяна", 25, "женщина", setThings2 );

        Worker[] workmax = {worker1, worker2};

        Shop hui = new Shop(workmax);
        //System.out.println(hui);


        //worker1.boasting(worker1.name, setThings2);




    }
}