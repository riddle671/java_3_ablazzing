package test;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            //numbers[numbers.length - i - 1] = temp;
            //System.out.println(temp);
            System.out.println(numbers[i]);
        }

        //System.out.println(Arrays.toString(numbers));

    }
}