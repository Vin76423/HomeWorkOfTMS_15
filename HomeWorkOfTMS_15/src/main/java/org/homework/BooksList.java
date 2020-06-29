package org.homework;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "books")
public class BooksList {
    private List<Book> books;

    public BooksList(List<Book> books) {
        this.books = books;
    }

    public BooksList() {
        books = new ArrayList<>();
    }



    public void setOneBook(Book book) {
        books.add(book);
    }

    @XmlElement(name = "book")
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
