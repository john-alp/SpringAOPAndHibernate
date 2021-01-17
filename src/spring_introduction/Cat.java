package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("catBean")
@Scope("singleton")
public class Cat implements Pet {
    public Cat() {
        System.out.println("create bean cat class");
    }
    @Override
    public void say() {
        System.out.println("May");
    }
}
