package homework.homework4.task1;

public class CarWash {

    int costWash;
    int taxAuto = 2000;
    int taxBus = 4000;

    public int getCostWash() {
        return costWash;
    }

    public int moika(Car  car) {
        car.setChist(true);
        if (car.getLength() > 6 || car.getHeight() > 2.5 || car.getWidth() > 2) {
            return costWash += taxBus;
        } else {
            return costWash += taxAuto;
        }
    }

    public int moika2(Car[]  car) {
        for (Car cars : car) {
            if (cars.getLength() > 6 || cars.getHeight() > 2.5 || cars.getWidth() > 2) {
                return costWash += taxBus;
            } else {
                return costWash += taxAuto;
            }
        }
        return costWash;
    }

}