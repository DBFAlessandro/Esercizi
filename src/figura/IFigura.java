
package figura;

//DEFINISCO UN INTERFACCIA IFIGURA
//PER IL CALCOLO DELL'AREA E PERIMETRO
public interface IFigura 
{
    //SOLO CAMPI FINAL STATIC
    public static final double PI = Math.PI;
    
    //SONO PUBBLICI PER DEFAULT
    public long perimetro();
    
    public double area();
}
