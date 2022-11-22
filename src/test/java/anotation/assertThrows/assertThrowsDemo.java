package anotation.assertThrows;

import BookStrore.exception.BookNotFoundException;
import BookStrore.model.BookModel;
import BookStrore.service.BookService;
import lombok.val;
import org.junit.jupiter.api.Test;

import java.awt.print.Book;

import static org.junit.jupiter.api.Assertions.assertThrows;

class  assertThrowsDemo {

     private BookService service;

     @Test
    void assertThrowsWithNoMessage(){
        service = new BookService();
        service.addBooks(
                new BookModel("1", "Head First Java", "Wrox")
        );
        service.addBooks(
                new BookModel("2", "Head First SQL", "Wrox")
        );
        service.addBooks(
                new BookModel("3", "Head First C#", "Wrox")
        );
        BookModel selectedBook = service.getBookByTitle("non");
        assertThrows(BookNotFoundException.class,
                    ()-> service.getBookByTitle("non"));

    }

}
