package structuralDesignPattern.decoratorDesignPattern.colorExample;

public abstract class ColorDecorator implements Color{

    protected Color colored;

    public ColorDecorator(Color colored){
        this.colored = colored;
    }

    public void fill(){
        colored.fill();
    }
}
