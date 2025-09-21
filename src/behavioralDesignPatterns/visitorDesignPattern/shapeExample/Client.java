package behavioralDesignPatterns.visitorDesignPattern.shapeExample;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Shape> all = new ArrayList<>();
        all.add(new Circle(3));
        all.add(new Square(4));
        all.add(new Rectangle(3, 4));

        AreaVisitor areaVisitor = new AreaVisitor();
        PerimeterVisitor perimeterVisitor = new PerimeterVisitor();

        for(Shape shape : all){
            shape.accept(areaVisitor);
            System.out.println(areaVisitor.getArea());
        }

        System.out.println("***---------------------**********-----------------------***");

        for(Shape shape : all){
            shape.accept(perimeterVisitor);
            System.out.println(perimeterVisitor.getPerimeter());
        }
    }
}
