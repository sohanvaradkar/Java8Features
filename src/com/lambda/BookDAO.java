package com.lambda;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBooks(){
        List<Book> books=new ArrayList<>();
        books.add(new Book(10,"Core java",100));
        books.add(new Book(20,"Spring ",200));
        books.add(new Book(30,"Hibernate",300));
        books.add(new Book(40,"Webservices",400));
        return books;
    }
}
