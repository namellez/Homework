package com.company.vector;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<Book>();


    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String title) {
        for (Book bk : books
                ) {
            if (bk.getTitle().equals(title)) {
                books.remove(bk);
            }
        }
    }

    public void removeBook(int id) {
        for (Book bk : books
                ) {
            if (bk.getId() == id) {
                books.remove(bk);
            }
        }

    }

    public Book searchBook(String request) {

        for (Book bk : books
                ) {
            if (bk.getTitle().equals(request) || bk.getAuthor().equals(request)) {
                return bk;
            }
        }
        return null;
    }

    public Book searchBook(int id) {

        for (Book bk : books
                ) {
            if (bk.getId() == id) {
                return bk;
            }
        }
        return null;
    }


    public void printAllBooks() {

        for (Book bk : books
                ) {
            System.out.println(bk);
        }

    }

    public void printBook(Book book) {

        if (book!=null){
            System.out.println(book);
        }else{
            System.out.println("Book not found!");
        }
    }

}
