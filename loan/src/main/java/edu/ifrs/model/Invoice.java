package edu.ifrs.model;

import java.util.ArrayList;

public class Invoice {
    
    private ArrayList<Book> books = new ArrayList<Book>();

    public Invoice(ArrayList<Book> books) {
        this.books = books;
    }

    public Invoice() {
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }


    public void addBook(Book book) {
        this.books.add(book);
    }



}