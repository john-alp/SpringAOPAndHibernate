package spring_introduction;

import spring_introduction.Dog;

public class Test1 {
    public static void main(String[] args) {
        Pet pet = new Dog();
        Pet cat = new Cat();
        pet.say();
        cat.say();
    }
}
