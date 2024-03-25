package edu.ifrs;

import java.util.ArrayList;

public class Invoice {
    
    private ArrayList<Book> books = new ArrayList<Book>();

    public Invoice(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public Invoice() {
    }

    public void addBook(Book book) {
        this.books.add(book);
    }


    // public void removeBook(Book book) {
    //     this.books.remove(book);
    // }

    // public void removeBook(int index) {
    //     this.books.remove(index);
    // }

    // public Book getBook(int index) {
    //     return this.books.get(index);
    // }

    // public int size() {
    //     return this.books.size();
    // }

    // public boolean isEmpty() {
    //     return this.books.isEmpty();
    // }

    // public void clear() {
    //     this.books.clear();
    // }

    // public boolean contains(Book book) {
    //     return this.books.contains(book);
    // }

    // public boolean contains(String bookNumber) {
    //     for (Book book : this.books) {
    //         if (book.getBookNumber().equals(bookNumber)) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // public boolean contains(int index) {
    //     return index >= 0 && index < this.books.size();
    // }

    // public void setBook(int index, Book book) {
    //     this.books.set(index, book);
    // }

  

}
