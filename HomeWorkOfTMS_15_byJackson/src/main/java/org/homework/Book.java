package org.homework;

public class Book {
    private int vendorCode;
    private String name;
    private String writer;
    private int year;

    public Book(int vendorCode, String name, String writer, int year) {
        this.vendorCode = vendorCode;
        this.name = name;
        this.writer = writer;
        this.year = year;
    }

    public Book() {
    }

    public int getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(int vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return  "Артикул : " + vendorCode +
                "\nНазвание : '" + name +
                "\nПисатель : " + writer +
                "\nБыла издана в : " + year + " году\n";

    }
}
