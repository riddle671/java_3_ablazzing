package homework.homework3.task1;

public abstract class Deciduous extends Tree {
    protected boolean presenceofLeaves;

    protected Deciduous(int age, boolean thereareLeaves) {
        super(age);
        this.presenceofLeaves = thereareLeaves;
    }

    public void blossom() {
        if (presenceofLeaves) {
            System.out.println("листья пропадают с дерева");
        } else {
            System.out.println("листья появляются");
        }
    }
}
