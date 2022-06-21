package controller;

import models.Book;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    List<Book> bookList = new ArrayList<>();


    public void addBooks(Book book){
        bookList.add(book);
    }

    public List<Book> searchBookByBookName(String bookName){
        List<Book> books = new ArrayList<>();
        for(Book book : this.bookList){
            if(book.getBookName().equalsIgnoreCase(bookName)){
                books.add(book);
            }
        }
        return books;
    }

    public List<Book> searchBookByAuthorName(String authorName){
        List<Book> books = new ArrayList<>();
        for(Book book : this.bookList){
            if(book.getAuthorName().equalsIgnoreCase(authorName)){
                books.add(book);
            }
        }
        return books;
    }
}
