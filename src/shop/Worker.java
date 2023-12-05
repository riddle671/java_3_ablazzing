package shop;

import java.util.Arrays;

public class Worker {
    public Worker(String name, int age, boolean gender, int[] veshi) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.veshi = veshi;
    }
    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", veshi=" + Arrays.toString(veshi) +
                '}';
    }
    String name;
    int age;
    boolean gender;
    int[] veshi;

    public void krik (String name , int fgh[]){
        this.name = name;
        this.veshi = fgh;
        System.out.println(name + "ghj" + fgh);



    }



}
