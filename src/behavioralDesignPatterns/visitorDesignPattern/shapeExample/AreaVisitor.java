package behavioralDesignPatterns.visitorDesignPattern.shapeExample;

public class AreaVisitor implements ShapeVisitor{
    private int area;

    @Override
    public void visit(Square square) {
        area = square.getSideLength() * square.getSideLength();
    }

    @Override
    public void visit(Rectangle rectangle) {
        area = rectangle.getRectangleLength() * rectangle.getRectangleBreadth();
    }

    @Override
    public void visit(Circle circle) {
        area = circle.getCircleRadius() * circle.getCircleRadius() * (int)Math.PI;//for now just store it as int.
    }

    public int getArea(){
        return this.area;
    }
}
