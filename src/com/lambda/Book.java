package com.lambda;

import java.util.Objects;

public class Book {
    int id;
    String bookName;
    int bookprice;

    public Book(int id, String bookName, int bookprice) {
        this.id = id;
        this.bookName = bookName;
        this.bookprice = bookprice;
    }

    public int getId() {
        return id;
    }

    public Book setId(int id) {
        this.id = id;
        return this;
    }

    public String getBookName() {
        return bookName;
    }

    public Book setBookName(String bookName) {
        this.bookName = bookName;
        return this;
    }

    public int getBookprice() {
        return bookprice;
    }

    public Book setBookprice(int bookprice) {
        this.bookprice = bookprice;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && bookprice == book.bookprice && Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bookName, bookprice);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookprice=" + bookprice +
                '}';
    }
}
