package homework.homework2.shop;

public class Runner {

    public static void main(String[] args) {
        Item hammer = new Item("молоток", 1000);
        Item screwdriver = new Item("отвертка", 50);
        Item notebook = new Item("тетрадка", 30);
        Item pen = new Item("ручка", 10);
        Item[] setThingsVasilij = {hammer, screwdriver};
        Item[] setThingsMarjana = {notebook, pen};
        Worker worker1 = new Worker("Василий", 30, "мужчина", setThingsVasilij);
        Worker worker2 = new Worker("Марьяна", 25, "женщина", setThingsMarjana);
        Worker[] workers = {worker1, worker2};
        Shop workShop = new Shop(workers);
        worker1.boasting(worker1.name, setThingsMarjana);
        worker2.boasting(worker2.name, setThingsVasilij);
    }
}