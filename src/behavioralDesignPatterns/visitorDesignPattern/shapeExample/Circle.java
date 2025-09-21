package behavioralDesignPatterns.visitorDesignPattern.shapeExample;

public class Circle implements Shape{
    private int circleRadius;

    public Circle(int r){
        this.circleRadius = r;
    }

    public int getCircleRadius() {
        return circleRadius;
    }

    public void setCircleRadius(int circleRadius) {
        this.circleRadius = circleRadius;
    }

    @Override
    public void accept(ShapeVisitor shapeVisitor) {
        shapeVisitor.visit(this);
    }
}
