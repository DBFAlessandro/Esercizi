/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblio;

/**
 *
 * @author Alessandro
 */
public class Libro 
{
    private int idl;
    private String autore;
    private String titolo;
    private int edizione;

   
    public Libro(int iDL, String autore, String titolo, int edizione) {
        this.idl     = iDL;
        this.autore   = autore;
        this.titolo   = titolo;
        this.edizione = edizione;
    }
     public Libro(int iDL) 
     {
        this.idl      = iDL;
        this.autore   = null;
        this.titolo   = null;
        this.edizione = 0;
    }
     public int getID() {
        return idl;
    }

    public String getAutore() {
        return autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getEdizione() {
        return edizione;
    }
    public Object[] toTableRow()
    {
      return new Object[]{idl,autore,titolo,edizione};
    }
    
    public String toString()
    {
      return "IDL:"+idl+",Titolo:"+titolo+",Autore:"+autore+",Edizione:"+edizione; 
    }
            
}
