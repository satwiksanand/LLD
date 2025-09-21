package behavioralDesignPatterns.visitorDesignPattern.shapeExample;

public interface ShapeVisitor {
    void visit(Square square);
    void visit(Rectangle rectangle);
    void visit(Circle circle);
}
