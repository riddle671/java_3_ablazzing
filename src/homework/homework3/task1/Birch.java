package homework.homework3.task1;

public class Birch extends Deciduous {
    public Birch(int age, boolean thereareLeaves) {
        super(age, thereareLeaves);
    }



    protected void presenceofLeaves() {
        if (presenceofLeaves == true) {
            System.out.println("листья опадают с березы");
        }  else {
            System.out.println("листья появляются на березе и она источает аллергены");
        }
    }




}
