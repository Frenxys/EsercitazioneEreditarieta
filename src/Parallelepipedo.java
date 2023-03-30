public class Parallelepipedo extends FiguraSolida{
    protected double base;
    private double altezza;
    private double profondita;
    public Parallelepipedo(double base,double altezza,double profondita,double x,double y,double z){
        super(x,y,z);
        setBase(base);
        setAltezza(altezza);
        setProfondita(profondita);

    }
    @Override
    public double getVolume() {
        return base*altezza*profondita;
    }
    public double getBase() {
        return base;
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
