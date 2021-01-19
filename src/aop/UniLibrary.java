package aop;

import org.springframework.stereotype.Component;

@Component()
public class UniLibrary extends AbstractLibrary {

    public void addBook(String person_name, Book book) {
        System.out.println("-------------------------------");
        System.out.println("We add the book of UniLibrary");
        System.out.println("-------------------------------");

    }

    public void getBook() {
        System.out.println("-------------------------------");
        System.out.println("We take the book of UniLibrary ");
        System.out.println("-------------------------------");

    }

    public void returnBook() {
        System.out.println("-------------------------------");
        System.out.println("We return the book of UniLibrary");
        System.out.println("-------------------------------");
    }

    public void addMagazine() {
        System.out.println("-------------------------------");
        System.out.println("We ADD journal в UniLibrary");
        System.out.println("-------------------------------");
    }

    public void getMagazine() {
        System.out.println("-------------------------------");
        System.out.println("We get journal of UniLibrary: ");
        System.out.println("-------------------------------");

    }

    public void returnMagazine() {
        System.out.println("-------------------------------");
        System.out.println("We return journal in UniLibrary");
        System.out.println("-------------------------------");
    }
}
