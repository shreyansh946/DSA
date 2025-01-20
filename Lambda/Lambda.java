package Lambda;

interface Shape {
    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle class: draw() method");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square class: draw() method");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle class: draw() method");
    }
}

public class Lambda {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.draw();

        Shape square = new Square();
        square.draw();

        Shape circle = new Circle();
        circle.draw();

        // Using Lambda Expressions
        Shape lambdaRectangle = () -> System.out.println("Lambda Rectangle: draw() method");
        Shape lambdaSquare = () -> System.out.println("Lambda Square: draw() method");
        Shape lambdaCircle = () -> System.out.println("Lambda Circle: draw() method");

        lambdaRectangle.draw();
        lambdaSquare.draw();
        lambdaCircle.draw();
    }
}
