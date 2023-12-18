package homework.homework4.task1;

public class CarWash {

    private int costWash;
    private int taxAuto = 2000;
    private int taxBus = 4000;

    public int getCostWash() {
        return costWash;
    }

    public int wash(Car  car) {
        car.setClean(true);
        if (car.getLength() > 6 || car.getHeight() > 2.5 || car.getWidth() > 2) {
             costWash += taxBus;
        } else {
             costWash += taxAuto;
        }
        return costWash;
    }

    public int wash(Car[]  car) {
        for (Car cars : car) {
            cars.setClean(true);
            if (cars.getLength() > 6 || cars.getHeight() > 2.5 || cars.getWidth() > 2) {
                 costWash += taxBus;
            } else {
                 costWash += taxAuto;
            }
        }
        return costWash;
    }

    @Override
    public String toString() {
        return "CarWash{" +
                "costWash=" + costWash +
                '}';
    }
}