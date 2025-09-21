package behavioralDesignPatterns.visitorDesignPattern.shapeExample;

public class PerimeterVisitor implements ShapeVisitor{
    private int perimeter;

    @Override
    public void visit(Square square) {
        perimeter = 4 * square.getSideLength();
    }

    @Override
    public void visit(Rectangle rectangle) {
        perimeter = 2 * (rectangle.getRectangleBreadth() + rectangle.getRectangleLength());
    }

    @Override
    public void visit(Circle circle) {
        perimeter = 2 * (int)Math.PI * circle.getCircleRadius();
    }

    public int getPerimeter(){
        return this.perimeter;
    }
}
