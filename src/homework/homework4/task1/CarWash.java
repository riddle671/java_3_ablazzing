package homework.homework4.task1;

public class CarWash {

    public int moika(Car  car) {
        car.setChist(true);
        if (car.getLength() > 6 || car.getHeight() > 2.5 || car.getWidth() > 2) {
            return 4000;
        } else {
            return 2000;
        }
    }

    public int moika2(Car[]  car) {
        int sum = 0;
        int taxAuto = 4000;
        int taxBus = 2000;
        for (Car cars : car) {
            if (cars.getLength() > 6 || cars.getHeight() > 2.5 || cars.getWidth() > 2) {
                return sum += taxBus;
            } else {
                return sum += taxAuto;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        CarWash carWash1 = new CarWash();
        Car car = new Bus(false, 7, 1, 1, 20);
        Car car2 = new Bus(false, 8, 1, 1, 20);
        Car car3 = new Bus(false, 8, 1, 1, 20);
        Car[] cars = new Car[] {car, car2, car3};
        //carmoik1.moika(car);
        System.out.println(carWash1.moika(car));
        //System.out.println(car.chist);
        //carmoik1.moika2(rrr);
        //System.out.println(carWash1.moika2(cars));

    }
}