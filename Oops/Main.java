package Oops;

abstract class Shape {
    abstract double area();
}

public class Main {
    public static void main(String[] args) {
        Shape myRectangle = new Rect(5, 3);
        System.out.println(myRectangle.area());  // Output: 15
    }
}

