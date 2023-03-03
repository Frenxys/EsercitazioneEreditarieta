public class ProvaParte3 {
    public static void main(String[] args){
        Quadrato q=new Quadrato(0,0,4);
        if(q.contiene(2,2)){
            System.out.println("contiene 2,2");
        }
        if(q.contiene(4,4)){ //ho messo che tutti i punti nel bordo sono considerati dentro al quadrato
            // se volessi sistemare mi basterebbe mettere < al posto di <=
            System.out.println("contiene 4,4");
        }
        if(q.contiene(5,5)){
            System.out.println("non dovrebbe conteenere 5,5");
        }
        Cerchio c=new Cerchio(0,0,5);
        if(c.contiene(2,-2)){
            System.out.println("contiene 2,-2");
        }
        if(c.contiene(-5,-5)){
            System.out.println("errore");
        }

    }
}
