package com.company.vector;

public class Main {

    public static void main(String[] args) {

        Library lib = new Library();

        lib.addBook(new Book("War and Peace", "Tolstoy", 1));
        lib.addBook(new Book("Java 8", "Shcmidt", 2));
        lib.addBook(new Book("Generation P", "Pelevin", 3));
        lib.addBook(new Book("Thunder", "Chekov", 4));
        lib.addBook(new Book("Idiot", "Dostoevsky", 5));

        lib.printAllBooks();

        System.out.println("----------------");

        lib.printBook(lib.searchBook(4));
        lib.printBook(lib.searchBook("Tolstoy"));
        lib.printBook(lib.searchBook("asdfg"));

        System.out.println("----------------");

        lib.removeBook(4);
        lib.removeBook("sdfsdf");

        lib.printAllBooks();

    }
}
