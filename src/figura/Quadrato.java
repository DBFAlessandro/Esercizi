/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author Alessandro
 */
public class Quadrato extends Figura
{
    public Quadrato(int l1) throws FiguraBadSideException
    {
      super(l1);
      
      nLati = 4;
    }
    
    
    
    @Override
     public double area()
    {
        return getLato1() * getLato1();
    }
    
    @Override
     public String toString()
     {
       return "N:"+getNLati()+",1:"+getLato1()+",2:"+getLato1()+",3:"+getLato1()+",4:"+getLato1()+",P:"+perimetro()+",A:"+area();
     }
     
     public static void test()
     {
       System.out.println("TEST QUADRATO");
       Quadrato q = null; 
       
       try 
        {
            q = new Quadrato(4);
            
        } 
        catch (FiguraBadSideException ex) 
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
            fi = new Quadrato(5);
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
            fi2 = new Quadrato(-3);
        } 
        catch (FiguraBadSideException ex)
        {
          System.out.println(fi);
        }
         finally
        {
           if(fi2!=null)
           {
             System.out.println(q);
           }
        }
     }
}
