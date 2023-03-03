abstract public class FiguraPiana extends Figura{
    protected double area;
    public FiguraPiana() {
        super("Figura Piana");
    }
    public double getArea(){
        return area;
    }
    public boolean contiene(double x,double y){
        return false;
    }
}
