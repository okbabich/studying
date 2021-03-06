package com.qa.studying.sandbox;

public class Point {

    public double x;
    public double y;

    public Point(){

    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point point){
        return Math.sqrt(Math.pow((point.x-x), 2) +  Math.pow((point.y - y), 2));
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
}
