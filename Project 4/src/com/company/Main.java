package com.company;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<Position, Boolean> px = new HashMap<>();
        for (int a = 0 ; a < 5000 ; a++) {
            int lit = (int) (Math.random() * (100));
            Position position = new Position((int) (Math.random() * (60)),(int) (Math.random() * (40)) );
            if (lit > 80) {
                px.put(position , true);
            } else {
                px.put(position , false);
            }
        } //a hash table to keep track of which positions are lit.
         // x ranes from 0 to 60
        // y ranes from 0 to 40
        // lit is a chance ranes 1 to 100
        // if it was more than 80 so its lit and if it was less than 50 it's unlit

        for (int b = 0 ; b < 5000 ; b++) {
            Position position = new Position((int) (Math.random() * (60)), (int) (Math.random() * (40)));
            if (px.get(position) != null) {
                if (px.get(position)) {
                    px.put(position , false);
                } else {
                    px.put(position , true);
                }
            }
        } //generate a list of 5000 random positions and checking lit positions.
        // x ranes from 0 to 60
        // y ranes from 0 to 40


        int c = 0;
        for (Boolean values : px.values()) {
            for(Boolean val1 :px.values()){
                if(val1 == true) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
                c++;
                if (c >= 190) {
                    System.out.println();
                    c = 0;
                }

            }
            break;
        } // lit prints  = "*"
        // unlit prints = " "
    }
}
