package org.homework;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BooksList booksList = new BooksList();
        booksList.setOneBook(new Book(13245, "Бойцовсий клуб", "Чак Поланник", 1996));
        booksList.setOneBook(new Book(10290, "Старик и море", "Эрнест Хэмингуэй", 1952));
        booksList.setOneBook(new Book(11243, "Горе от ума", "Алеександр Грибоедов", 1825));
        booksList.setOneBook(new Book(31941, "Война и мир", "Леа Толстой", 1865));


        try {
            JAXBContext context = JAXBContext.newInstance(BooksList.class, Book.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//            marshaller.marshal(booksList, System.out);
            marshaller.marshal(booksList, new File("booksByJAXB.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }



        try {
            JAXBContext context = JAXBContext.newInstance(BooksList.class, Book.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            BooksList books = (BooksList) unmarshaller.unmarshal(new File("booksByJAXB.xml"));
            for (Book book : books.getBooks())
                System.out.println(book);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
