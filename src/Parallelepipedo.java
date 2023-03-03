public class Parallelepipedo extends FiguraSolida{
    protected double base;
    private double altezza;
    private double profondita;
    protected double x; //coordinate del centro del solido
    protected double y;
    protected double z;
    public Parallelepipedo(double base,double altezza,double profondita,double x,double y,double z){
        super();
        setBase(base);
        setAltezza(altezza);
        setProfondita(profondita);
        setX(x);
        setY(y);
        setZ(z);

    }

    @Override
    public double getVolume() {
        return base*altezza*profondita;
    }

    public double getBase() {
        return base;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public void setProfondita(double profondita) {
        this.profondita = profondita;
    }
}
