package com.company;
//Name : soha kord                        ID: 983212058
//File name : project4.java

//a Position class with integer fields x and y that represent the screen position of a pixel.
//overriding equals(object o)

public class Position {
    private int x, y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Position) {
            Position position = (Position) o;
            return position.y == this.y && position.x == this.x;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.x / 60 + this.y / 40;
       // return super.hashCode();
    }


}
