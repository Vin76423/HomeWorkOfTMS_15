package org.homework;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlType(propOrder = {"vendorCode", "name", "writer", "year"})
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

    @XmlElement(name = "vendor_code")
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return  "Артикул : " + vendorCode +
                "\nНазвание : '" + name +
                "\nПисатель : " + writer +
                "\nБыла издана в : " + year + " году\n";
    }
}
