
package figura;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Rettangolo extends Figura
{
    private int lato2;
    
    public Rettangolo(int l1, int l2) throws FiguraBadSideException
    {
      super(l1);
        
       if(l2 <=0)
        {
             throw new FiguraBadSideException("lato non valido ",l2);
        }
       if(l1 == l2)
          {
           throw new FiguraBadSideException("I lati devono essere diversi",l1,l2);
        }
       
      lato2 = l2;
      nLati = 4;
    }
    public int getLato2()
    {
      return lato2;  
    }
    @Override
    public double area() 
    {
       return getLato1() * lato2;
    }
    
    @Override
    public long perimetro()
    {
       return getLato1() + lato2 + getLato1() + lato2 ;
    }
    @Override
    public String toString()
    {
      return "N:"+getNLati()+",1:"+getLato1()+",2:"+lato2+",3:"+getLato1()+",4:"+lato2+",P:"+perimetro()+",A:"+area();
    }
     public static void test()
     {
       System.out.println("TEST RETTANGOLO");
       Rettangolo q = null; 
        try
        {
            q = new Rettangolo(4,4);
           
        } catch (FiguraBadSideException ex) 
        {
             System.out.println(ex); 
        }
        finally
        {
          if(q!=null)
          {
            System.out.println(q);
          }
        }
       Figura fi = null; 
        try 
        {
            fi = new Rettangolo(5,4);
            
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
            fi2 = new Rettangolo(-3,4);
           
        } catch (FiguraBadSideException ex)
        {
               System.out.println(ex); 
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
