package homework.homework4.task1;

public class CarWash {

    private int costWash;
    private int priceWashPassenger = 2000;
    private int priceWashBus = 4000;

    public int getCostWash() {
        return costWash;
    }

    public int wash(Car car) {
        if (car.isClean()) {
            return costWash;
        } else if (car.getLength() > 6 || car.getHeight() > 2.5 || car.getWidth() > 2) {
            costWash += priceWashBus;
        } else {
            costWash += priceWashPassenger;
        }
        car.setClean(true);
        return costWash;
    }

    public int wash(Car[] car) {
        for (Car cars : car) {
            this.wash(cars);
        }
        return costWash;
    }
}