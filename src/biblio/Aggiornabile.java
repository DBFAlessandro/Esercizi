
package biblio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public interface Aggiornabile 
{
    //IMPLEMENTARE QUESTO METODO PER ASSEGNARE UN ASCOLATORE DI EVENTI AD UNO O PIU PRODUTTORI
      public void addListener(ActionListener listener); 
    //IMPLEMENTARE QUESTO METODO PER RIVECEVERE UN EVENTO UPDATE DI QUALCHE TIPO
      public void update(ActionEvent e, Object data);
   
}
