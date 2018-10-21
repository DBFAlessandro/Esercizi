
package figura;

public class TriangoloEquilatero extends Triangolo 
{
    public TriangoloEquilatero(int l1) throws FiguraBadSideException
    {
        //chiamo il costruttore della classe Triangolo
        super(l1,l1,l1); 
    } 
  
      public static void test()
    {
       System.out.println("TEST EQUILATERO");
         TriangoloEquilatero ts = null; 
       try
       {
           ts = new TriangoloEquilatero(4);
          
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
           fi = new TriangoloEquilatero(3);
        
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
        fi2 = new TriangoloEquilatero(-3);  
       } 
       catch (FiguraBadSideException ex)
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
