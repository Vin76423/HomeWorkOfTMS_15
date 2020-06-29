package org.homework;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(13245, "Бойцовсий клуб", "Чак Поланник", 1996));
        books.add(new Book(10290, "Старик и море", "Эрнест Хэмингуэй", 1952));
        books.add(new Book(13245, "Горе от ума", "Алеександр Грибоедов", 1825));
        books.add(new Book(13245, "Война и мир", "Леа Толстой", 1865));
        String path = "booksByJackson.json";



        try {
            write(books, path);
            List<Book> newBooks = read(path);
            for (Book book : newBooks){
                System.out.println(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }







    public static void write(List<Book> books, String path) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
//        mapper.writeValue(System.out, books);
        mapper.writeValue(new File(path), books);
    }

    public static List<Book> read(String path) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
//            List books = mapper.readValue(new File("booksByJackson.json"), ArrayList.class);
//            for (Object book : books) {
//                System.out.println(book);
//            }
        TypeReference<List<Book>> type = new TypeReference<List<Book>>() {};
        return mapper.readValue(new File(path), type);
    }
}
