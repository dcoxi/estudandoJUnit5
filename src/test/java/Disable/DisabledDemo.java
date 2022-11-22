package Disable;

import BookStrore.model.BookModel;
import BookStrore.service.BookService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


@Disabled
class DisabledDemo {

    private BookService service;

    @Test
    void assertNullWithMessage() {
        service = new BookService();
        BookModel heabFirstJavaBook = new BookModel("1", "Head First Java", "Wrox");
        BookModel heabFirstDesignPatternBook = new BookModel("2", "Head First Design Pattern", "Packt");

        service.addBooks(heabFirstJavaBook);
        service.addBooks(heabFirstDesignPatternBook);

        BookModel result = service.getBookById("8");
        assertNotNull(result);
    }

    @Test
    void assertSoma() {
        assertEquals(3, 2 + 1, "Valor diferente");
    }

}
