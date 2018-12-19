package com.qa.studying.sandbox;

public class Main {
    public static void main(String[] args){

        Point p1 = new Point(2.04, 78);
        Point p2 = new Point(3, 7.78);

        System.out.println("Distance between p1 with coordinates: (" + p1.x + ";" + p1.y + ") and p2 with coordinates: (" + p2.x + ";" + p2.y + ") = " + p1.distance(p2));



    }

}
