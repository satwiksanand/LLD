package behavioralDesignPatterns.visitorDesignPattern.shapeExample;

public interface Shape {
    void accept(ShapeVisitor shapeVisitor);
}
