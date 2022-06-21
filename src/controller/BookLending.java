package controller;

import Enums.Constants;
import models.Book;
import models.Person;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class BookLending {
    boolean lendBook(Book b, Person p){
        int qty = b.getBookQty();
        RentedBook rentedBook = new RentedBook(b);
        if(qty > 0){
            p.setRentedBooks(rentedBook);
            b.setBookQty(qty-1);
            return true;
        } else{
            System.out.println("Book N/A");
            return false;
        }
    }

    public void listAllUserRentedBook(Person p){
        List<RentedBook> books = p.getRentedBooks();
        System.out.println(" For User : "+ p.getName());
        for (RentedBook rb: books){
            System.out.println("Book Name: "+ rb.getBook().getBookName() +
                    " Author Name: "+ rb.getBook().getAuthorName() +
                    " Rented Date: " + rb.getStartDate());
        }
    }

    public void listAllUserPenaltyBook(Person p){
        List<RentedBook> books = p.getRentedBooks();
        System.out.println(" For User : "+ p.getName());
        for (RentedBook rb: books){
            int days = Period.between(rb.getStartDate(), LocalDate.now()).getDays();
            if(days > Constants.MAX_LENDING_DAYS){
                System.out.println("Book Name: "+ rb.getBook().getBookName() +
                        " Author Name: "+ rb.getBook().getAuthorName() +
                        " Rented Days: " + days +
                         " Extra Days: " + (days - Constants.MAX_LENDING_DAYS) +
                        " Penalty Charges: " + (days - Constants.MAX_LENDING_DAYS) * Constants.PENALTY_PER_DAY
                );
            }
        }
    }

}
