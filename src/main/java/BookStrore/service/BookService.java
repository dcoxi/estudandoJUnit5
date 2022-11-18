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
}
