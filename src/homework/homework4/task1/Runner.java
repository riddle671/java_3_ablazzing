package homework.homework4.task1;

public class Runner {
    public static void main(String[] args) {
        CarWash carWash1 = new CarWash();
        Car passengeCar1 = new PassengeCar(false, 1.8, 2, 5,true);
        Car passengeCar2 = new PassengeCar(false, 1.8, 2, 5, true);
        Car passengeCar3 = new PassengeCar(false, 1.8, 2, 5, true);
        Car passengeCar4 = new PassengeCar(false, 1.8, 2, 5, true);
        Car bus1 = new Bus(false, 2.3, 3, 12, 20);
        Car bus2 = new Bus(false, 2.3, 3, 12, 20);
        Car bus3 = new Bus(false, 2.3, 3, 12, 20);
        Car bus4 = new Bus(false, 2.3, 3, 12, 20);
        Car bus5 = new Bus(false, 2.3, 3, 12, 20);
        Car[] cars = new Car[] {passengeCar1, passengeCar2, passengeCar3, passengeCar4, bus1, bus2, bus3, bus4, bus5};
        //carWash1.wash(passengeCar1);
        //System.out.println(carWash1.getCostWash());
        carWash1.wash(cars);
        System.out.println(carWash1.getCostWash());



    }
}
