package homework.homework3.task1;

public class  Runner {

    public static void main(String[] args) {
        Tree pine = new Pine(32, true);
        Tree spruce = new Spruce(14, false);
        Tree birch = new Birch(22, true);
        Tree[] trees = new Tree[] {pine, spruce, birch};
        int averageAge = 0;
        for (Tree tree : trees) {
            averageAge += tree.getAge();
        }
        System.out.println("ср.Возраст " + averageAge / 3);


        //birch.leavesOnTree();
    }

}
