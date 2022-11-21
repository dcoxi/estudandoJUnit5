package assertFalse;

import BookStrore.model.BookModel;
import BookStrore.service.BookService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AssertFalseDemo {

    private BookService service;

    @Test
    void assertFalseWithNoMessage() {
        service = new BookService();
        List<BookModel> listBooks = service.books();
        service.addBooks(
                new BookModel("1", "Head First Java", "Wrox")
        );

        assertFalse(listBooks.isEmpty());
    }

    @Test
    void assertFalseWithCostumMessage() {
        service = new BookService();
        List<BookModel> listBooks = service.books();

        service.addBooks(
                new BookModel("2", "Head First Java", "Wrox")
        );

        assertFalse(listBooks.isEmpty(), "Lista de livros não esta vázia!");
        //Com expressão lambda
        // assertFalse(listBooks.isEmpty(),() ->"Lista de livros não esta vázia!");
    }

    void assertFalseWithMessageSupplier() {
        service = new BookService();
        List<BookModel> listBooks = service.books();

        service.addBooks(
                new BookModel("2", "Head First Java", "Wrox")
        );

        assertFalse(listBooks.isEmpty(), () -> "Lista de livros não esta vázia!");

    }

    void assertFalseWithBoolenAndMessageSupplier() {
        service = new BookService();
        List<BookModel> listBooks = service.books();

        service.addBooks(
                new BookModel("2", "Head First Java", "Wrox")
        );

        assertFalse(() -> listBooks.isEmpty(), () -> "Lista de livros não esta vázia!");

    }
}