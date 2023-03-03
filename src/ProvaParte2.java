public class ProvaParte2 {
    public static void main(String[] args){
        FiguraPiana[] p=new FiguraPiana[10];
        FiguraSolida[] s=new FiguraSolida[10];
        Cubo c=new Cubo(0,0,0,4); //4^3=64
        Parallelepipedo pa=new Parallelepipedo(4,5,3,0,0,0); //4*5*3=60
        s[1]=pa;
        s[0]=c;
        Quadrato q=new Quadrato(0,0,4); // 4*4=16,
        p[0]=q;
        System.out.println("l'area totale risulta:"+ServizioFigure.totaleArea(p));
        System.out.println("il volume totale risulta:"+ServizioFigure.totaleVolume(s));
        Figura[] f=ServizioFigure.unione(s,p);
        System.out.println("l'area totale risulta:"+ServizioFigure.totaleArea(f));
        System.out.println("il volume totale risulta:"+ServizioFigure.totaleVolume(f));
    }
}
