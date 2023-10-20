package com.company;

public class Book extends Publication {
    protected String author;

    public Book(String publisher, int pagesNumber, double price, String title , String author) {
        super(publisher, pagesNumber, price, title);
        this.author = author;
    }
    public void print(){
        System.out.println("title : " + title + " \t " + "publisher : " + publisher + " \t " + "price : " + price + " \t " + "number of pages : " +
                pagesNumber + " \t " + "author : " + author);
    }
}
