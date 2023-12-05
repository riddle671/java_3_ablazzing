package homework.homework1;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {

        //Перевернуть массив(без сторонних классов), не создавая новый массив. Вывести на экран.
        //"Перевернуть" - значит последние элементы становятся первыми и наоборот.
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < numbers.length / 2; i++) {
            int tmp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = tmp;
        }
        //System.out.println(Arrays.toString(numbers));
       // System.out.println(tmp);



            // Узнать как работает
       /* int[] numbers2 = new int[numbers.length];
        //System.out.println(numbers2.length);
        for (int i = numbers.length - 1; i > 0; ) {
            for (int j = 0; j < numbers.length; j++) {
                numbers2[j] = numbers[i];
                i--;
                //System.out.println(Arrays.toString(numbers));

            }
            System.out.println(Arrays.toString(numbers2));
        }*/

    }
}
