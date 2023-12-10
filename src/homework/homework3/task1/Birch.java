package homework.homework3.task1;

public class Birch extends Deciduous {
    public Birch(int age, boolean thereareLeaves) {
        super(age, thereareLeaves);
    }

    protected void leavesFall() {
        if (presenceofLeaves) {
            System.out.println("листья пропадают с березы");
        }
    }

    protected void leavesBloom() {
        if (presenceofLeaves) {
            System.out.println("листья появляются на березе и она источает аллергены");
        }
    }
}
