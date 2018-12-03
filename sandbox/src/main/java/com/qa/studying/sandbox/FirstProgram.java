package com.qa.studying.sandbox;

public class FirstProgram {

    public static void main(String[] args){
        hello("world");
        hello("guy");
        hello("Batman");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямогуольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
}
    public static void hello(String somebody){
        System.out.println("Hello, " + somebody + "!");

}
}
