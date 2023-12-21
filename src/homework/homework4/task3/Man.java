package homework.homework4.task3;

public class Man implements Speakable {

    @Override
    public String speak() {
        return "Я человек.";
    }

    public static void main(String[] args) {
        Man man1 = new Man();
        System.out.println(man1.speak());

    }
}

