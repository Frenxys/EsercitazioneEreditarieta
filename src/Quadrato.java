public class Quadrato extends Rettangolo{
    public Quadrato(double x, double y, double lato) {
        super(x, y, lato,lato);
    }

    @Override
    public String toString() {
        return "quadrato(x,y,l)=("+super.getX()+" "+super.getY()+" "+super.getBase()+")";
    }
}