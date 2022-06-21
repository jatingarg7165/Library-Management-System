package controller;

import models.Book;

import java.time.LocalDate;

public class RentedBook {
    Book book;
    LocalDate startDate;
    int lateCharges;
    int extraDays;


    public RentedBook(Book book){
        this.book = book;
        this.startDate = LocalDate.now();
        this.lateCharges = 0;
        this.extraDays = 0;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getLateCharges() {
        return lateCharges;
    }

    public void setLateCharges(int lateCharges) {
        this.lateCharges = lateCharges;
    }

    public int getExtraDays() {
        return extraDays;
    }

    public void setExtraDays(int extraDays) {
        this.extraDays = extraDays;
    }
}
