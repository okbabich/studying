package com.qa.studying.sandbox;


public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(2.04, 78);
        Point p2 = new Point(3, 7.78);

        System.out.println("Distance between p1 with coordinates: (" + p1.getX() + ";" + p1.getY() + ")" + " and p2 with" +
                " coordinates: (" + p2.getX() + ";" + p2.getY() + ") = " + distance(p1, p2));

        System.out.println("Method in a class result: Distance between p1 with coordinates: (" + p1.getX() + ";" + p1.getY() + ")" + " and p2 with" +
                " coordinates: (" + p2.getX() + ";" + p2.getY() + ") = " + Point.distance(p1,p2));

    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));

    }

}

