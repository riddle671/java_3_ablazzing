package homework.homework1;
import java.util.Random;


public class Test3 {
    public static void main(String[] args) {
        //Написать код, генерирующий случайные числа до тех пор, пока не сгенерируется 999.
        //Вывести номер попытки, с которой получилось получить случайным образом число 999.
        Random random = new Random();
        int number = 0;
        int count = 0;
       while (number != 999){
           int guess = random.nextInt(1000);
           number = guess;
           count++;
       }
        System.out.println("Попытка № " + count);




    }
}
