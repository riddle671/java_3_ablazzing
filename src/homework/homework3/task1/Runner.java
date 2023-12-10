package homework.homework3.task1;

public class  Runner {

    public static void main(String[] args) {
        Tree pine = new Pine(37, true);
        Tree spruce = new Spruce(14, false);
        Tree birch = new Birch(22, true);
        Tree[] trees = {pine, spruce, birch};
        int averageAge = (pine.getAge() + spruce.getAge() + birch.getAge()) / 3;
        System.out.println(averageAge);
    }
}