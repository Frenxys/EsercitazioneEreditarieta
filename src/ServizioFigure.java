public class ServizioFigure {
    public static double totaleArea(FiguraPiana f[]){
        double somma=0;
        for(int i=0; i<f.length; i++){
            if(f[i]==null){
                continue;
            }
            somma+=f[i].getArea();
        }
        return somma;
    }
    public static double totaleArea(Figura f[]){
        double somma=0;
        for(int i=0; i<f.length; i++){
            if(f[i]==null){
                continue;
            }
            else if(f[i] instanceof FiguraPiana){ //f[i].getTipo().equals("Figura piana")
                somma+=((FiguraPiana) f[i]).getArea();
            }
        }
        return somma;
    }
    public static double totaleVolume(FiguraSolida f[]){
        double somma=0;
        for(int i=0; i<f.length; i++){
            if(f[i]==null){
                continue;
            }
            somma+=f[i].getVolume();
        }
        return somma;
    }
    public static double totaleVolume(Figura f[]){
        double somma=0;
        for(int i=0; i<f.length; i++){
            if(f[i]==null){
                continue;
            }
            else if(f[i] instanceof FiguraSolida){ //f[i].getTipo().equals("Figura solida")
                somma+=((FiguraSolida) f[i]).getVolume();
            }
        }
        return somma;
    }
    public static Figura[] unione(FiguraSolida[] f,FiguraPiana[] f1){
        Figura[] figure=new Figura[f.length+f1.length];
        int z=0;
        for(int i=0; i<f.length; i++){
            figure[z]=f[i];
            z++;
        }
        for(int i=0; i<f1.length; i++){
            figure[z]=f1[i];
            z++;
        }
        return figure;
    }
    public static Figura[] unione2(FiguraSolida[] f,FiguraPiana[] f1){ //metodo aggiuntivo magico
        Figura[] figure=new Figura[f.length+f1.length];
        System.arraycopy(f,0,figure,0,f.length);
        System.arraycopy(f1,f.length,figure,f.length,f1.length);
        return figure;
    }
    public static int quantiContengono(double x,double y,FiguraPiana[] f){
        int contengono=0;
        for(int i=0; i<f.length; i++){
            if(f[i]==null){
                continue;
            }
            else if(f[i].contiene(x,y)){
                contengono++;
            }
        }
        return contengono;
    }


}
