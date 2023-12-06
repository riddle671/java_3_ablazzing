package shop;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Item molotok = new Item("молоток", 1000);
        Item otvertka = new Item("отвертка", 50);
        Item tetradka = new Item("тетрадка",30);
        Item ru4ka = new Item("ручка", 10);

        Item[] pred1 = {molotok, otvertka};
        Item[] pred2 = {tetradka, ru4ka};

        Worker worker1 = new Worker("tom", 30, pred1 );
        Worker worker2 = new Worker("natali", 45, pred2);

        Worker[] workmax = {worker1, worker2};




    }
}
