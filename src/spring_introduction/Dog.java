package spring_introduction;

public class Dog implements Pet{
    private String name;

    public Dog() {
        System.out.println("create bean dog class");
    }

    @Override
    public void say() {
        System.out.println("Gav - gav");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    private void init() {
        System.out.println("INIT");
    }

    private void destroy() {
        System.out.println("DESTROY");
    }

}
