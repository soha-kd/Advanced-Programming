package com.company;

public class KidsMagazine extends Magazine {
    protected  String ageRange;

    public KidsMagazine(String publisher, int pagesNumber, double price, String title, String publishUnit , String ageRange ) {
        super(publisher, pagesNumber, price, title, publishUnit);
        this.ageRange =ageRange;
    }
    public void print(){
        System.out.println("title : " + title + " \t " + "publisher : " + publisher + " \t " + "price : " + price + " \t " + "number of pages : " +
                pagesNumber +" \t " + "publication unit : " + publishUnit + " \t " + "age range : " + ageRange);
    }
}
