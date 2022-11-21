package assertArrays;

import BookStrore.model.BookModel;
import BookStrore.service.BookService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

 class AssertArrayDemo {

    private BookService service;

    @Test
    void assertWithNoMessage(){
        service = new BookService();
        BookModel heabFirstJavaBook = new BookModel("1","Head First Java","Wrox");
        BookModel heabFirstDesignPatternBook = new BookModel("2","Head First Design Pattern","Packt");
        BookModel heabFirstJavaScript = new BookModel("3","Head First JavaScript","Wrox");

        service.addBooks(heabFirstJavaBook);
        service.addBooks(heabFirstDesignPatternBook);
        service.addBooks(heabFirstJavaScript);

        String[] result = service.getBookIdsByPublisher("Wrox");
        assertArrayEquals(new String[] {"1","3"},result);
    }
}
