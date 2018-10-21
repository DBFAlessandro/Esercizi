
package figura;

//IMPLEMENTO UNA CLASSA ASTRATTA
//QUINDI NON INSTANZIABILE
//SULLA BASE DELL'INTERFACCIA IFGURA
public abstract class Figura implements IFigura
{
    //LE CLASSI DERIVATTE VEDONO SEMPRE QUESTO CAMPO
    //ANCHE DALL'ESTERNO E' SEMPRE ACCESSIBILE SENZA GETTERS E SETTERS 
    public int nLati;
    //VISIBILE SOLO IN QUESTA CLASSE
    private int lato1;
    //LE CLASSI ASTRATTE POSSONO AVERE UN COSTRUTTORE
    //CHE ANDRA SEMPRE CHIAMATO DALLE DERIVATE(SE PARAMETRIZZATO)
    public Figura(int l1) throws FiguraBadSideException 
    {
        //VERIFICO LE PRECONDIZIONI
        if(l1 <=0)
        {
            //INVALIDO LA COSTRUZIONE DELL'OGGETTO
            //PERCHE' LE PRECONDIZIONI NON SONO SODDISFATTE
             throw new FiguraBadSideException("lato non valido ",l1);
        
        }
      //INIZIALIZZO LE VARIABILI DI ISTANZA
      nLati = 1;
      lato1 = l1;
    }
   
    //METODI GETTER PROPRI DELLA CLASSE ASTRATTA, MA VISIBILI ALLE DERIVATE IN QUANTO PUBBLICI
    public int getLato1()
    {
      return lato1;  
    }
    
    public int getNLati()
    {
     return nLati;
    }
    
    
    //IMPLEMENTAZIONE DEI METODI DI INTERFACCIA
    //VA SEMPRE FATTA
    //LE CLASSI DERIVATE POTRANNO SEMPRE OVERRIDARE QUESTO METODO SE VOLUTO
    @Override
    public  long perimetro()
    {
     return (long)lato1 * nLati;
    }
    
    //DATO CHE LA CLASSE E' ASTRATTA POSSO PERMETTERMI
    //DI FiRMARE IL METODO DI INTERFACCIA COME ASTRATTO
    //E DELEGARNE LA COSTRUZIONE ALLE CLASSI DERIVATE
    @Override
    public abstract double area();
   
}
