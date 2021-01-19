package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("TAi Pen")
    private String name;

    @Value("Karnely")
    private String author;

    @Value("1991")
    private int yesrOfPublication;

    public String getAuthor() {
        return author;
    }

    public int getYesrOfPublication() {
        return yesrOfPublication;
    }

    public String getName() {
        return name;
    }
}
