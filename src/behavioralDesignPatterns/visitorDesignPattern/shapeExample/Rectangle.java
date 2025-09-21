package behavioralDesignPatterns.visitorDesignPattern.shapeExample;

public class Rectangle implements Shape{
    private int rectangleLength;
    private int rectangleBreadth;

    public Rectangle(int a, int b){
        this.rectangleLength = a;
        this.rectangleBreadth = b;
    }

    public int getRectangleLength() {
        return rectangleLength;
    }

    public void setRectangleLength(int rectangleLength) {
        this.rectangleLength = rectangleLength;
    }

    public int getRectangleBreadth() {
        return rectangleBreadth;
    }

    public void setRectangleBreadth(int rectangleBreadth) {
        this.rectangleBreadth = rectangleBreadth;
    }

    @Override
    public void accept(ShapeVisitor shapeVisitor) {
        shapeVisitor.visit(this);
    }
}
