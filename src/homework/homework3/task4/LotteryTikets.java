package homework.homework3.task4;

public class LotteryTikets {

    private static  int countTickets = 0;

    public int checkluck() {
        countTickets ++;
        if (countTickets % 100 == 0) {
            return 5000;
        } else if (countTickets % 10 == 0) {
            return 100;
        } return 0;
    }

}
