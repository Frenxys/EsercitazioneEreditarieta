import static java.lang.Math.pow;
public class Cubo extends Parallelepipedo{
    public Cubo(double x,double y,double z,double lato) {
        super(lato,lato,lato,x,y,z);
    }
    public double getVolume(){
        return pow(base,3);
    }
    @Override
    public String toString() {
        return "quadrato(x,y,z,l)=("+x+" "+y+" "+z+" "+base+")";
    }
}
