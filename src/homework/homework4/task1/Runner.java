package homework.homework4.task1;

public class Runner {
    public static void main(String[] args) {
        CarWash carWash1 = new CarWash();
        Car car = new Bus(false, 1, 1, 1, 20);
        Car car2 = new Bus(false, 8, 1, 1, 20);
        Car car3 = new Bus(false, 8, 1, 1, 20);
        Car[] cars = new Car[] {car, car2, car3};
        carWash1.moika(car);
        System.out.println(carWash1.getCostWash());
        carWash1.moika2(cars);
        System.out.println(carWash1.getCostWash());





    }
}
