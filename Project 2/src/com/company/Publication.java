package com.company;

public class Publication {
    protected String publisher;
    protected int pagesNumber;
    protected double price;
    protected String title;
    public Publication(String publisher , int pagesNumber , double price , String title){
        this.pagesNumber = pagesNumber;
        this.price = price;
        this.publisher = publisher;
        this.title = title;
    }
    public void print(){
        System.out.println("title : " + title + " \t " + "publisher : " + publisher + " \t " + "price : " + price + " \t " + "number of pages : " + pagesNumber);
    }
}
