package com.company.vector;

public class Book {

    private String title;
    private String author;
    private int id;

    public Book() {
        this("", "", 0);
    }

    public Book(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (id != book.id) return false;
        if (!title.equals(book.title)) return false;
        return author.equals(book.author);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + id;
        return result;
    }


    @Override
    public String toString() {
        return "'" + title + "'" + " by " + author + " (id: " + id + ")";
    }

}
