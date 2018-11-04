
package biblio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


//QUESTA CLASSE SI OCCUPA DI GESTIRE LA BIBLIOTECA
//RAPPRESENTA IL TRAMITE TRA L'INTERFACCIA AGGIORNABILE E I DATI
public class GestoreBiblioteca implements ActionListener

{
    //L'INTERFACCIA AGGIORNABILE DOVREBBE SAPERE COME INTERPRETARE I DATI
    private final Aggiornabile finestra;
    
    private Utente       utenteSelezionato;
    private Libro        libroSelezionato;
    private Prestito     prestitoSelezionato;

    public GestoreBiblioteca(Aggiornabile finestra)
    {
        this.finestra = finestra;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
     String command = e.getActionCommand();
     //VERIFICO ALCUNI COMANDI INTERATIVI CHE RAPPRESENTANO UN CERTO STATO
     //DELL'INTERFACCIA AGGIORNABILE
     switch(command)
     {
        case ComandiBiblioteca.SEL_UTENTE :    
                         utenteSelezionato    = (Utente)e.getSource();
                         return;
        case ComandiBiblioteca.SEL_LIBRO :
                         libroSelezionato     = (Libro)e.getSource();
                         return;
        case ComandiBiblioteca.SEL_PRESTITO :
                         prestitoSelezionato  = (Prestito)e.getSource();
                         return;
     }
     
     //COMANDI CON L'INTERFACCIA BIBLIOTECA
     Object result = null;
    
    //APRO / ESEGUO / CHIUDO, MA POTREI TENERLA COME MEMBRO(chiamiamolo campo che è meglio) DI CLASSE 
     try(IBiblioteca biblio = new BibliotecaCasalinga())
     {

      //VERIFICO CHE EVENTO MI ARRIVA DALL'INTERFACCIA AGGIORNABILE
      //E RISPONDO DI CONSEGUENZA
      switch(e.getActionCommand())
      {
     //non sto li a verificare le references
          //se xx case avessi voluto usare altri comandi (x il fatto ad es che nei button x default sono chiamati 
          //xon il testo del bottone, se non mi andasse bene potrei associargli una stringa nome, moolto piu chiara
          //e indipendente : new JButton("Tasto").setName("Pigia");
        
           case ComandiBiblioteca.GET_LIBRI : 
               
                         libroSelezionato  =  null;
                         result = biblio.getLibri();   
                         break;
           case ComandiBiblioteca.GET_LIBRO : 
                         //x ora la get libro agisce sul libro in prestito
                         if(prestitoSelezionato !=null)
                         {
                            result = biblio.getLibro(prestitoSelezionato.getLibro()); 
                         }
                         break;              
           case ComandiBiblioteca.GET_UTENTI : 
               
                         utenteSelezionato = null;
                         result = biblio.getUtenti();   
                         break;
                         
           case ComandiBiblioteca.GET_PRESTITI :
               
                         result = biblio.getPrestiti();   
                         break;
                         
           case ComandiBiblioteca.GET_PRESTITI_UTENTE : 

                         if(utenteSelezionato !=null)
                         {
                           prestitoSelezionato = null;
                           result = biblio.getPrestiti(utenteSelezionato); 
                         }
                         break;
                         
          case ComandiBiblioteca.GET_PRESTITI_LIBRO : 
              
                         if(libroSelezionato != null)
                         {
                          prestitoSelezionato = null;
                          result = biblio.getPrestiti(libroSelezionato); 
                         }
                         break;
           case ComandiBiblioteca.REM_PRESTITO_UTENTE : 
              
                         if(prestitoSelezionato !=null)
                         {
                           Prestito tmp = prestitoSelezionato;  
                           prestitoSelezionato = null;
                           
                           result = biblio.remPrestito(tmp); 
                           
                            if((Boolean)result == false)
                             {
                                finestra.update(e,null);
                             }
                           
                               //aggiorno la screen dei prestiti 
                               //rispetto all'azione che aveva portato la selezione
                               //del prestito
                               if(utenteSelezionato !=null)
                                 {
                                   result = biblio.getPrestiti(utenteSelezionato); 
                                 }
                                 else
                                 if(libroSelezionato != null)
                                 {                  
                                   result = biblio.getPrestiti(libroSelezionato); 
                                 }
                            
                           
                         }
                         break;
                         
           case ComandiBiblioteca.ADD_PRESTITO_UTENTE : 
               
                    
                       
                     if(utenteSelezionato != null && libroSelezionato !=null)
                       {
                         result = biblio.addPrestito(new Prestito(utenteSelezionato,libroSelezionato)); 
                         
                         
                          if((Boolean)result == false)
                             {
                                 //comunico un warnin sull'operaione
                                finestra.update(e,null);
                             }
                           
                            //aggiorno la screen dei prestiti sull'utente
                            result = biblio.getPrestiti(utenteSelezionato); 
                               
                       }
                     break;
                         
          default: break;
      
      }
   
    
     } 
     catch (BibliotecaCasalinga.BibliotecaException ex)
     {
        finestra.update(e,ex);
     }
     catch (Exception ex)
     {
        finestra.update(e,ex);
     }
     

     finestra.update(e,result);
    
    }
}
