package aop;

import org.springframework.stereotype.Component;

@Component("libralyBean")
public class Library {
    public void getBook() {
        System.out.println("We take the book");
    }
}
