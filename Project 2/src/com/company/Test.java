package com.company;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Publication> publications = new ArrayList<>();
        Publication p1 = new Publication("Ghalam" , 123 , 45000 , "Roman");
        Book b1 = new Book("Simon & Schuster" , 337 , 45000 ,"Pride and Prejudice" , "Jane Austen" );
        Book b2 = new Book("Washington Square Press" , 368 ,38000 ,"A man called Ove"  ,"Fredrik Backman");
        Book b3 = new Book("Negah publication" , 269 , 38500 , "Chashm hayash" , "Bozorg Alavi");
        Magazine m1 = new Magazine("Condei Nast" , 40 , 100000 ,"Vogue" , "monthly" );
        Magazine m2 = new Magazine("Roshd" , 25 , 15000 , "Daneshnameh" , "monthly");
        Magazine m3 = new Magazine("Hamshahri" , 30 , 15800 , "Danestaniha" , "annually");
        KidsMagazine k1 = new KidsMagazine("Mehrab ghalam" , 8 , 8500 , "Gol Pooneh" , "weekly" , "8-10");
        KidsMagazine k2 = new KidsMagazine("Roshd" , 10 , 14000 , "Koodak" , "monthly" , "5-9");
        KidsMagazine k3 = new KidsMagazine("Pouya" , 8 , 6500 , "Tizhoosh" , "weekly" , "6-8");
        publications.add(p1);
        publications.add(b1);
        publications.add(b2);
        publications.add(b3);
        publications.add(m1);
        publications.add(m2);
        publications.add(m3);
        publications.add(k1);
        publications.add(k2);
        publications.add(k3);
        publications.sort((t1, t2) -> t1.title.compareTo(t2.title));
        System.out.println("sorted by title : ");
        while (true){
            int i = 1;
            for(Publication pub : publications){
                System.out.print(i + " . " );
                i++;
                pub.print();
            }
            break;
        }
        System.out.println("--------------------------------------------");


    }
}
