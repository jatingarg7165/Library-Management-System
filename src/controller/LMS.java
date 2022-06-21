package controller;

import models.Book;
import models.Person;

public class LMS {

    public static void main(String[] args){
        Book b1 = new Book("a1", "b1" , 1, 0);
        Book b2 = new Book("a2", "b2" , 2, 10);
        Book b3 = new Book("a3", "b3" , 3, 10);
        Book b4 = new Book("a4", "b4" , 4, 10);
        Book b5 = new Book("a5", "b5" , 5, 10);

        BookList bookList = new BookList();
        bookList.addBooks(b1);
        bookList.addBooks(b2);
        bookList.addBooks(b3);
        bookList.addBooks(b4);
        bookList.addBooks(b5);



        Person p1 = new Person("p1", "xyz", "765");
        Person p2 = new Person("p2", "xyz", "765");

        BookLending bookLending = new BookLending();
        bookLending.lendBook(b1,p1);
        bookLending.lendBook(b2,p1);
        bookLending.lendBook(b3,p1);

        bookLending.listAllUserRentedBook(p1);
        bookLending.listAllUserPenaltyBook(p1);

        bookLending.listAllUserRentedBook(p2);


    }
}
