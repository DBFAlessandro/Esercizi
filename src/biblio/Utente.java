/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblio;


public class Utente 
{
    private int idu;
    private String nominativo;
    private String indirizzo;


    public Utente(int idu, String nominativo, String indirizzo) {
        this.idu = idu;
        this.nominativo = nominativo;
        this.indirizzo = indirizzo;
    }
     public Utente(int idu)
     {
        this.idu = idu;
        this.nominativo = null;
        this.indirizzo  = null;
    }
    public int getID() 
    {
        return idu;
    }

    public String getNominativo() {
        return nominativo;
    }

    public String getIndirizzo() {
        return indirizzo;
    }
     public Object[] toTableRow()
    {
      return new Object[]{idu,nominativo,indirizzo};
    }
    
    public String toString()
    {
      return "IDU:"+idu+",Nominativo:"+nominativo+",Indirizzo:"+indirizzo; 
    }
}
