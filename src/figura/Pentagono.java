
package figura;


public class Pentagono extends Figura
{
   
    //ASSUMO IL PENTAGONO COME REGOLARE
    public Pentagono(int l1) throws FiguraBadSideException
    {
        //LE ECCEZIONI DELLA CLASSE BASE SONO RIGETTATE
        super(l1);
        nLati = 5;
    }

    @Override
    public double area() 
    {
        return ((double)((long)getLato1() * getLato1())) * 1.72;
    }
    
    @Override
    public String toString()
    {
      return "N:"+getNLati()+",1:"+getLato1()+",2:"+getLato1()+",3:"+getLato1()+",4:"+getLato1()+",5:"+getLato1()+",P:"+perimetro()+",A:"+String.format("%,.5f",area());
    }
    
    public static void test()
    {
        System.out.println("TEST PENTAGONO");
        Pentagono p = null; 
        
        try
        {
            p = new Pentagono(4);
                
        } catch (FiguraBadSideException ex)
        {
             System.out.println(ex); 
        }
        finally
        {
         if(p!=null)
         {
           System.out.println(p);
         }
        }
       Figura fi = null; 
        try
        {
            fi = new Pentagono(5);
          
        } catch (FiguraBadSideException ex)
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
            fi2 = new Pentagono(-3);
           
        } catch (FiguraBadSideException ex) 
        {
          System.out.println(ex.toString()); 
        }
       finally
        {
         if(fi2!=null)
         {
           System.out.println(fi2);
         }
        }
    }
}
