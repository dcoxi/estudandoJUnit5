package BookStrore.service;

import BookStrore.model.BookModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {

    private List<BookModel> listBook = new ArrayList();

    public void addBooks(BookModel obj){
        listBook.add(obj);
    }

    public List<BookModel> books(){
        return Collections.unmodifiableList(listBook);
    }

    public BookModel getBookById(String Id){
        BookModel bookModel = new BookModel()   ;
        for(BookModel book : listBook){
            if(Id.equals(book.getId()))
                bookModel = book;
        }
        return  bookModel;
    }

    public String[] getBookIdsByPublisher(String publisher){
        List<String> bookIds = new ArrayList<>();
        for(BookModel book : listBook){
            if(publisher.equalsIgnoreCase(book.getPublisher()))
                bookIds.add(book.getId());
        }
        return bookIds.toArray(new String[bookIds.size()]);
    }
}
