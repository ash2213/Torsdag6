package Task4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Shape> differentshapes= new ArrayList<>();
        Circle circle1= new Circle(2.0);
        Square square1= new Square(4);

        ShapeBuilder shape = new ShapeBuilder(new ArrayList<>());

        Shape circle2= new Circle(10.0);
        Shape square2= new Square(12.0);
        shape.addShape(circle2);
        shape.addShape(square2);


        System.out.println("Area of Square "+ square1.getArea());
        System.out.println("Area of Circle "+ circle1.getArea());

        System.out.println("Total area of all shapes "+ shape.getTotalArea());

    }
}
