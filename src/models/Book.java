package models;

public class Book {
    String authorName;
    String bookName;
    int sNo;
    int bookQty;


    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getsNo() {
        return sNo;
    }

    public void setsNo(int sNo) {
        this.sNo = sNo;
    }

    public int getBookQty() {
        return bookQty;
    }

    public void setBookQty(int bookQty) {
        this.bookQty = bookQty;
    }


    public Book(String aName, String bNmae, int sn, int bq){
        authorName = aName;
        bookName = bNmae;
        sNo = sn;
        bookQty = bq;
    }


}
