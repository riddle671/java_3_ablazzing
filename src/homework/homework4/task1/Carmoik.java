package homework.homework4.task1;

public class Carmoik {
    static int sum = 0;

    public int moika(Car  car) {
        car.setChist(true);
        if (car.dlin > 6 || car.visot > 2.5 || car.shirin > 2) {
            return 4000;
        } else

            return 2000;

    }
    public int moika2(Car[]  car){

        moika(new Bus(false,6,1,1,20));
        return 2000;
    }

    public static void main(String[] args) {
        Carmoik carmoik1 = new Carmoik();
        Car car = new Bus(false,6,1,1,20);
        Car car2 = new Bus(false,6,1,1,20);
        Car[] rrr = new Car[] {car, car2};
        //carmoik1.moika(car);
        //System.out.println(carmoik1.moika(car));
        //System.out.println(car.chist);
        System.out.println(carmoik1.moika2(rrr));



    }
}