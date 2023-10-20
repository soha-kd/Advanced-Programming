package com.company;

public class Magazine extends Publication {
    protected String publishUnit;

    public Magazine(String publisher, int pagesNumber, double price, String title , String publishUnit) {
        super(publisher, pagesNumber, price, title);
        this.publishUnit = publishUnit;
    }
    public void print(){
        System.out.println( "title : " + title  + " \t " +"publisher : " + publisher +" \t " + "price : " + price + " \t " + "number of pages : " +
                pagesNumber + " \t " + "publication unit : " + publishUnit);
    }
}
