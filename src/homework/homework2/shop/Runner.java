package homework.homework2.shop;

public class Runner {

    public static void main(String[] args) {
        Item Hammer = new Item("молоток", 1000);
        Item Screwdriver = new Item("отвертка", 50);
        Item Notebook = new Item("тетрадка",30);
        Item Pen = new Item("ручка", 10);
        Item[] setThingsVasilij = {Hammer, Screwdriver};
        Item[] setThingsMarjana = {Notebook, Pen};
        Worker worker1 = new Worker("Василий", 30, "мужчина", setThingsVasilij );
        Worker worker2 = new Worker("Марьяна", 25, "женщина", setThingsMarjana );
        Worker[] workmax = {worker1, worker2};
        Shop workShop = new Shop(workmax);
        worker1.boasting(worker1.name, setThingsMarjana);
        worker2.boasting(worker2.name, setThingsVasilij);
    }
}