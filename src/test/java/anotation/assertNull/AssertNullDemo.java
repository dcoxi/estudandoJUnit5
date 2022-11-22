package anotation.assertNull;

import BookStrore.model.BookModel;
import BookStrore.service.BookService;
import org.junit.jupiter.api.Test;

import java.awt.print.Book;

import static org.junit.jupiter.api.Assertions.assertNull;

public class AssertNullDemo {

    private BookService service;

    @Test
    public void assertNullWithMessage(){
        service = new BookService();
        BookModel heabFirstJavaBook = new BookModel("1","Head First Java","Wrox");
        BookModel heabFirstDesignPatternBook = new BookModel("2","Head First Design Pattern","Packt");

        service.addBooks(heabFirstJavaBook);
        service.addBooks(heabFirstDesignPatternBook);

        BookModel result = service.getBookById("3");
        assertNull(result);
    }
}
