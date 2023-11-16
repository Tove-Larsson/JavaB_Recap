package com.tove.demo;

public class Book {

    private int amountOfPages;
    private String author;

    private String title;

    public Book(int amountOfPages, String author, String title) {
        this.amountOfPages = amountOfPages;
        this.author = author;
        this.title = title;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "amountOfPages=" + amountOfPages +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
