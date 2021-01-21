package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext");
    Pet pet = context.getBean("myPet", Pet.class);
    pet.say();

    context.close();
    }
    int a = 1;
    int b = 44;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test2 test2 = (Test2) o;

        if (a != test2.a) return false;
        return b == test2.b;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b;
        return result;
    }
}
