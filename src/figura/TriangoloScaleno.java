
package figura;

public class TriangoloScaleno extends Triangolo 
{
    public TriangoloScaleno(int l1,int l2, int l3) throws FiguraBadSideException
    {
        super(l1,l2,l3);
       
        if(l1 == l2 || l1==l3 || l2 == l3)
        {
            throw new FiguraBadSideException("I lati devono essere diversi",l1,l2,l3);
        }
     
    }
    
    public static void test()
    {
       System.out.println("TEST SCALENO");
         TriangoloScaleno ts = null; 
       try 
       {
           ts = new TriangoloScaleno(4,2,3);
        
       } catch (FiguraBadSideException ex) 
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
           fi = new TriangoloScaleno(-3,3,5);
           
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
           fi2 = new TriangoloScaleno(3,3,3);
          
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