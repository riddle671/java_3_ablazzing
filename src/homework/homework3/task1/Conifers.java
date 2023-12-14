package homework.homework3.task1;

public abstract class Conifers extends Tree {

    protected boolean needleType;

    protected Conifers(int age, boolean needleType) {
        super(age);
        this.needleType = needleType;
    }
}
