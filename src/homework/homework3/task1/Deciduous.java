package homework.homework3.task1;

public class Deciduous extends Tree {

   protected boolean presenceofLeaves;

   public Deciduous(int age, boolean thereareLeaves) {

      super(age);
      this.presenceofLeaves = thereareLeaves;
   }

   protected void presenceofLeaves() {
      if (presenceofLeaves == true) {
         System.out.println("листья опадают с дерева");
      }  else {
         System.out.println("листья появляются на дереве");
   }

   }
}