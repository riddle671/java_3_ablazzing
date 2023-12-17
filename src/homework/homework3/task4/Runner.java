package homework.homework3.task4;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {


        int countTicket = 110;
        LotteryTikets[] lotteryTikets = new LotteryTikets[countTicket];
            for (int i = 0; i < countTicket; i++) {
            lotteryTikets[i] = new LotteryTikets();

        }

        int sum = 0;
        for (int j = 0; j < lotteryTikets.length; j++) {
            sum += lotteryTikets[j].checkluck();

        }
        System.out.println(lotteryTikets.length);
        System.out.println(sum);
    }
}