package homework.homework3.task1;

public class Deciduous extends Tree {
    protected boolean presenceofLeaves;

    public Deciduous(int age, boolean thereareLeaves) {

        super(age);
        this.presenceofLeaves = thereareLeaves;
    }

    protected void leavesFall() {
        if (presenceofLeaves) {
            System.out.println("листья пропадают с дерева");
        }
    }
    protected void leavesBloom() {
        if (presenceofLeaves) {
            System.out.println("листья появляются");
        }
    }
}