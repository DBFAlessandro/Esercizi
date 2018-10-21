
package figura;


public class Triangolo extends Figura
{
    //IL TRIANGOLO HA 3 LATI
    //AGGIUNGO 2 CAMPI E METTO 3 PARAMTERI AL COSTRUTTORE
   private int lato2;
   private int lato3;
   
    public Triangolo(int l1,int l2,int l3)  throws FiguraBadSideException
    {
        //assegno al costruttore della superclasse il primo lato, che già fa la verifica delle precondizioni sul primo
        super(l1);
        //verifico se gli altri 2 lati soddisfano le precondzioni
        if(l2 <= 0 && l3 <= 0)
        {
             throw new FiguraBadSideException("lati non validi ",l2,l3);
        }
        else
        if(l2 <= 0)
        {
             throw new FiguraBadSideException("lato non valido ",l2);
        }
        else
        if(l1 <= 0)
        {
             throw new FiguraBadSideException("lato non valido ",l3);
        }  
      
        //verifico le precondizioni note della lunghezza dei lati di un quadrato
        //un lato non può essere maggiore o uguale alla somma degli altri 2
        //peraccedere al parametro del primo lato uso il metodo pubblico perchè la variabile era privata
        if(getLato1()>=(l2+l3))
       {
         throw new FiguraBadSideException("lato non validi ",getLato1());
       }
        if(lato2>=(l2 + l3))
       {
        throw new FiguraBadSideException("lato non valido ",l2);
       }
        if(lato3>=(getLato1()+l2))
       {
           throw new FiguraBadSideException("lato non valido ",l3);
       }
        lato2 = l2;
        lato3 = l3;
        nLati = 3;
    }
    //faccio l'override dei metodi della superclasse
   @Override
    public long perimetro()
    {
        return getLato1() + lato2 + lato3;
    }
   @Override
    public double area() 
    {
       double p = perimetro() / 2.0;

       return Math.sqrt
        (
            p*(p-getLato1())*(p-lato2)*(p-lato3)
        );
    
    }
    //AGGIUNGO 2 GETTERS PER I 2 LATI AGGIUNTI ALLA FIGURA TRIANGOLO
    public double getLato2()
    {
      return lato2;
    }
      public double getLato3()
    {
      return lato3;
    }
      //OVERRIDE DEL TOSTRING, CLASSE BEN FORMATA
   @Override
    public String toString()
    {
      return "N:"+getNLati()+",1:"+getLato1()+",2:"+lato2 + ",3:"+lato3+",P:"+perimetro()+",A:"+String.format("%,.5f",area());
    }
    //TESTO LE FUNZIONALITA' DELLA CLASSE
    public static void test()
    {
         System.out.println("TEST TRIANGOLO");

       Triangolo ts = null; 
       try
       {
           ts = new Triangolo(4,2,3);    
       }
       catch (FiguraBadSideException ex) 
       {
            System.out.println(ex); 
       }
       finally
       {
           if(ts!=null)
           {
            System.out.println(ts);
           }
       }
       
       Figura fi = null; 
       try
       {
           fi = new Triangolo(3,3,5);  
       } 
       catch (FiguraBadSideException ex)
       {
            System.out.println(ex); 
       }
       finally
       {
          if(fi!=null)
          {
           System.out.println(fi);
          }
       }
       
       Figura fi2 = null; 
       
       try 
       {
           
           fi2 = new Triangolo(3,3,3);
           
       } catch (FiguraBadSideException ex)
       {
           System.out.println(ex); 
       } 
       finally
       {
        if(fi2!=null)
          {
           System.out.println(fi);
          }
       }
     
    }
}
