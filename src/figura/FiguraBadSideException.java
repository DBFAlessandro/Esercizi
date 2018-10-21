
package figura;

//DEFINISCO UNA CLASSE APPOSITA DA ASSOCIARE ALLA CLASSE ASTRATTA FIGURA
//CHE GESTISCE LA SUA TIPOLOGIA DI ECCEZIONI
//ANDRA' GETTATA(throw) NEL CASO LE PRECONDIONI DEI COSTRUTTORI(marcati con throws FiguraBadSideException)
//NON SIANO CORRETTE INVALIDANDO QUINDI LA COSTRUZIONE E INIZIALIZZAZIONE DELL'OGGETTO
public class FiguraBadSideException extends Exception
{
    String messaggio = null;
    //DECIDO DI PASSARE TUTTI I PARAMTERI IERI DESIDERATI COME ARGOMENTO
    //LE CLASSI FIGURA AVRANNO,.. PER ORA CORRISPONDENTI ALLA MISURA DEI LATI COME PARAMETRI
    public FiguraBadSideException(String m,int ... args)
    {
      //SOLO PER VERIFICARE USO DI METODI UTILITY AGGIUNGO QUA
      //LE INFO SULLE CHIAMATE ALLO 
      messaggio = "";
      
      for(StackTraceElement s : getStackTrace())
      {  
          messaggio += s + "\n";
      }
      
      messaggio+= m;
      
      for(int i : args)
      {
       messaggio += " " + i;
      }
    }
     public FiguraBadSideException(int ... args)
    {
         messaggio = "";
       //SOLO PER VERIFICARE USO DI METODI UTILITY AGGIUNGO QUA
      //LE INFO SULLE CHIAMATE ALLO STACK
      for(StackTraceElement s : getStackTrace())
      {  
          messaggio += s + "\n";
      }
     
      for(int i : args)
      {
       messaggio += i + " ";
      }
    }
    @Override
    public String toString()
    {
      return messaggio;
    }
}
