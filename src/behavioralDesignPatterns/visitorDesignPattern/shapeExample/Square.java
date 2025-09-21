package behavioralDesignPatterns.visitorDesignPattern.shapeExample;

public class Square implements Shape{
    private int sideLength;

    public Square(int val){
        this.sideLength = val;
    }

    public int getSideLength(){
        return this.sideLength;
    }

    public void setSideLength(int val){
        this.sideLength = val;
    }

    @Override
    public void accept(ShapeVisitor shapeVisitor) {
        shapeVisitor.visit(this);
    }
}
