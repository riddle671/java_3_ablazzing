package homework.homework2;

import java.util.Arrays;
import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {
        // Задание 1
        //Дан массив с массивом чисел внутри
        //Посчитать сумму каждой диагонали используя цикл(ы)
        //Вывесим на экран
        //С левого верхнего угла к нижнему правому
        //int leftUpToRightDownSum = 0;
        //С левого нижнего угла к верхнему правому
        //int leftDownToRightUpSum = 0;
        int[][] arrayOfNumbers = new int[10][10];
        arrayOfNumbers[0] = new int[]{131, 2, 3, 4, 5, 6, 7, 8, 9, 102};
        arrayOfNumbers[1] = new int[]{1, 20, 3, 4, 5, 6, 7, 8, 93, 10};
        arrayOfNumbers[2] = new int[]{1, 2, 31, 4, 5, 6, 7, 81, 9, 10};
        arrayOfNumbers[3] = new int[]{1, 2, 3, 45, 5, 6, 77, 8, 9, 10};
        arrayOfNumbers[4] = new int[]{1, 2, 3, 4, 57, 67, 7, 8, 9, 10};
        arrayOfNumbers[5] = new int[]{1, 2, 3, 4, 533, 68, 7, 8, 9, 10};
        arrayOfNumbers[6] = new int[]{1, 2, 3, 40, 5, 6, 72, 8, 9, 10};
        arrayOfNumbers[7] = new int[]{1, 2, 30, 4, 5, 6, 7, 83, 9, 10};
        arrayOfNumbers[8] = new int[]{1, 20, 3, 4, 5, 6, 7, 8, 901, 10};
        arrayOfNumbers[9] = new int[]{10, 2, 3, 4, 5, 6, 7, 8, 9, 101};
        int leftUpToRightDownSum = 0;
        int leftDownToRightUpSum = 0;
        for(int i = 0; i < arrayOfNumbers.length; i++) {
            leftUpToRightDownSum = leftUpToRightDownSum + arrayOfNumbers[i][i];
        }
        for (int i = 9; i < arrayOfNumbers.length && i > -1 ; i--) {
            leftDownToRightUpSum = leftDownToRightUpSum + arrayOfNumbers[i][arrayOfNumbers.length - i - 1];
        }
        System.out.println("Сумма главной диагонали: " + leftUpToRightDownSum);
        System.out.println("Сумма побочной диагонали: " +leftDownToRightUpSum);


        // Задание 2
        //Перевернуть массив(без сторонних классов), не создавая новый массив. Вывести на экран.
        //"перевернуть" - значит последние элементы становятся первыми и наоборот.
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(numbers));

        // Задание 3
        //Дан распределитель случайных чисел
        //Random random = new Random(1);
        //Получение случайного числа
        //int number = random.nextInt(1000);
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