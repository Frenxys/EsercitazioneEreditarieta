abstract public class FiguraSolida extends Figura{
    protected double x; //coordinate del centro del solido
    protected double y;
    protected double z;
    public FiguraSolida(double x,double y,double z) {
        super("Figura solida");
    }
    abstract public double getVolume();
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

}
