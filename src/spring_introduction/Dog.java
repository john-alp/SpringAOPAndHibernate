package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("dogBean")
@Scope("singleton")
//@Scope("prototype")
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


//    @PostConstruct
//    private void init() {
//        System.out.println("INIT");
//    }
//
//    @PreDestroy
//    private void destroy() {
//        System.out.println("DESTROY");
//    }

}
