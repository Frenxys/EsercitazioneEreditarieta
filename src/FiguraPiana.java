abstract public class FiguraPiana extends Figura{
    protected double area;
    public FiguraPiana() {
        super("Figura Piana");
    }
    abstract public double getArea();
    public boolean contiene(double x,double y){
        return false;
    }
}
