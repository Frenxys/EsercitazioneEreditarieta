import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Sfera extends FiguraSolida{
    private double r;
    public Sfera(double x,double y,double z,double r) {
        super(x,y,z);
        setR(r);
    }
    @Override
    public double getVolume() {
        return (double)((4/3)*PI*pow(r,3));
    }
    @Override
    public String toString() {
        return "Sfera(x,y,z,r)=("+x+" "+y+" "+z+" "+r+")";
    }
    public void setR(double r) {
        this.r = r;
    }
}
