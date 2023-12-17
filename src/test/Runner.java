package test;

public class Runner {
    public static void main(String[] args) {
        CheapCamera cheapCamera = new CheapCamera();
        ExpensiveCamera expensiveCamera = new ExpensiveCamera();
        PhoneWithCheapCamera phoneWithCheapCamera = new PhoneWithCheapCamera(cheapCamera);
        PhoneWithExpensiveCamera phoneWithExpensiveCamera = new PhoneWithExpensiveCamera(expensiveCamera);
        Phone phone = new Phone(cheapCamera);
        //phone.getCamera().getZoom();
        System.out.println(phone.getCamera().zoom);







    }
}
