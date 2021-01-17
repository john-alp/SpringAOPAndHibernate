package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog mydog = context.getBean("dogBean", Dog.class);
        mydog.say();

        //        Dog yourDog = context.getBean("dogBean", Dog.class);
//
//        System.out.println("equals? " + (mydog == yourDog));

        context.close();
    }
}
