package anotation.assertTrue;

import BookStrore.model.BookModel;
import BookStrore.service.BookService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


 class AssertTrueDemo {

    private BookService service;

    @Test
    void assertTrueWithNoMessage(){
        service = new BookService();
        List<BookModel> listBooks = service.books();
        service.addBooks(
                new BookModel("1", "Head First Java", "Wrox")
        );

        assertTrue(listBooks.isEmpty());
    }

    @Test
    void assertTrueWithCostumMessage(){
        service = new BookService();
        List<BookModel> listBooks = service.books();

            service.addBooks(
                new BookModel("2", "Head First Java", "Wrox")
        );

        assertTrue(listBooks.isEmpty(),"Lista de livros não esta vázia!");
       //Com expressão lambda
        // assertTrue(listBooks.isEmpty(),() ->"Lista de livros não esta vázia!");
    }
}
