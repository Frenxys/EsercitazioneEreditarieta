import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Cerchio extends FiguraPiana{
    private double x; //coordinate centro
    private double y; //coordinate centro
    private double r; //raggio
    public Cerchio(double x,double y,double r) {
        super();
        setX(x);
        setY(y);
        setR(r);
    }
    @Override
    public double getArea(){
        return r*PI;
    }
    @Override
    public String toString(){
        return "cerchio(x,y,r)=("+x+" "+y+" "+r+")";
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setR(double r) {
        this.r = r;
    }
    public boolean contiene(double x,double y){
        return (sqrt(pow((x - this.x), 2) + pow((y - this.y), 2)) )<= r;
    }
}
