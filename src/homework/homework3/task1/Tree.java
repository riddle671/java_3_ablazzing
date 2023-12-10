package homework.homework3.task1;

public class Tree {

    protected int age;

    public Tree(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Pine pine1 = new Pine(12,true);
        Birch birch1 = new Birch(12, false);
        Deciduous deciduous1 = new Deciduous(44, false);
        deciduous1.presenceofLeaves();
        birch1.presenceofLeaves();



    }




}
