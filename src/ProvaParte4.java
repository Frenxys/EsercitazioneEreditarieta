public class ProvaParte4 {
    public static void main(String[] args){
        FiguraPiana[] p=new FiguraPiana[10];
        Quadrato q=new Quadrato(0,0,4); //contiene 2,2
        Cerchio c=new Cerchio(0,0,5); //contiene 2,2
        Rettangolo r=new Rettangolo(0,0,4,5); //contiene 2,2
        Cerchio k=new Cerchio(0,0,2); //non contiene 2,2
        p[0]=q;
        p[1]=c;
        p[2]=r;
        p[3]=k;
        System.out.println("nell'array ci sono in tutto:"+ServizioFigure.quantiContengono(2,2,p)+" figure che contengono 2,2");


    }
}
