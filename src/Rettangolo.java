public class Rettangolo extends FiguraPiana{
    private double x; //angolo inferiore sinistro
    private double y; //angolo inferiore sinistro
    private double base;
    private double altezza;
    public Rettangolo(double x,double y,double base,double altezza) {
        super();
        setX(x);
        setY(y);
        setBase(base);
        setAltezza(altezza);
    }
    public boolean contiene(double x,double y){
        return this.x <= x && (x <= this.x + base) && this.y <= y && y <= (this.y + altezza);
    }
    @Override
    public double getArea() {
        return base*altezza;
    }

    public double getBase() {
        return base;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "rettangolo(x,y,b,a)=("+x+" "+y+" "+base+" "+altezza+")";
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }
}
