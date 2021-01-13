package spring_introduction;

public class Cat implements Pet {
    public Cat() {
        System.out.println("create bean cat class");
    }
    @Override
    public void say() {
        System.out.println("May");
    }
}
