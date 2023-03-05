abstract public class FiguraSolida extends Figura{
    protected double volume;
    public FiguraSolida() {
        super("Figura solida");
    }
    abstract public double getVolume();
}
