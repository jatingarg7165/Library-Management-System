package models;

import controller.RentedBook;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private String email;
    private String phone;
    private List<RentedBook> rentedBooks = new ArrayList<>();

    public Person(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public List<RentedBook> getRentedBooks() {
        return rentedBooks;
    }

    public void setRentedBooks(RentedBook rentedBook) {
        rentedBooks.add(rentedBook);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
