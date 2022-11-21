package assertTimeoutPreemptively;

import BookStrore.model.BookModel;
import BookStrore.service.BookService;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

class assertTimeoutPreemptivelyDemo {

    private BookService service;

    @Test
    public void assertTimeoutWithNoMessage() {
        service = new BookService();

        for (int i = 1; i <= 10000; i++) {
            service.addBooks(new BookModel(String.valueOf(i), "Head First Java", "Wrox"));
        }

        List<String> listTitles = new ArrayList<>();

        assertTimeoutPreemptively(Duration.ofMillis(1), () ->
        {
            listTitles.addAll(service.getBookTitlesByPublisher("Wrox"));
        });
        assertEquals(10000, listTitles.size());
    }

    @Test
    public void assertTimeoutWithMessage() {
        service = new BookService();

        for (int i = 1; i <= 10000; i++) {
            service.addBooks(new BookModel(String.valueOf(i), "Head First Java", "Wrox"));
        }

        List<String> listTitles = new ArrayList<>();

        assertTimeoutPreemptively(Duration.ofMillis(1), () ->
                {
                    listTitles.addAll(service.getBookTitlesByPublisher("Wrox"));
                },
                "Tempo limite excedido!");

        assertEquals(10000, listTitles.size(),
                "Tamanho de lista não correspondente.");
    }

}
