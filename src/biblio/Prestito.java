/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblio;


public class Prestito
{
    private String data;
    private Utente utente;

   
    private Libro libro;
    
    public Prestito(String data, Utente utente, Libro libro) {
        this.data   = data;
        this.utente = utente;
        this.libro   = libro;
    }
     public Prestito(String data, int idUtente, int idLibro) {
        this.data    = data;
        this.utente  = new Utente(idUtente);
        this.libro   = new Libro(idLibro);
    }
       public Prestito(int idUtente, int idLibro) {
        this.data    = null;
        this.utente  = new Utente(idUtente);
        this.libro   = new Libro(idLibro);
    }
       
    public Prestito(Utente utente, Libro libro) {
        this.data    = null;
        this.utente  = utente;
        this.libro   = libro;
    }
    public String getData() {
        return data;
    }

    public Utente getUtente() {
        return utente;
    }

    public Libro getLibro() {
        return libro;
    }
    
      public Object[] toTableRow()
    {
      return new Object[]{libro.getID(),data,utente.getNominativo(),utente.getIndirizzo(),utente.getID()};
    }
    
    public String toString()
    {
      return "IDL:"+libro.getID()+",IDU:"+utente.getID()+",Data:"+data; 
    }
}
