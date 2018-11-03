/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblio;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class BibliotecaCasalinga implements IBiblioteca
{

    //all'inizio tutto era statico 
    private static Connection connect()
    {  
        try
        {
            return DriverManager.getConnection
                     (
                      ComandiBiblioteca.SUPER_SECRET_CONNECTION,
                      ComandiBiblioteca.SUPER_SECRET_USER,
                      ComandiBiblioteca.SUPER_SECRET_PWD
                     );
       
        } 
        catch (SQLException ex) 
        {
            //DOVREI SCRIVERE DA QUALCHE PARTE L'ERRORE
            gestisciErroreSQL(ex);
         
        }
        
        return null;
    }
    
    private static void disconnect(Connection con) 
    { 
        try 
        {
            con.close();
        } 
        catch (SQLException ex) 
        {
           gestisciErroreSQL(ex);
        }
    }
 
    //TUTTI I LIBRI DISPONIBILI
    private static ArrayList<Libro> getLibri(Connection con)
    {
       String SQL = "SELECT IDL,Autore,Titolo,Edizione from libri where IDU IS NULL AND DataP IS NULL;";
       
       ArrayList<Libro> libri = new ArrayList<>();
               
       try 
       {
            Statement stmt = con.createStatement();
            ResultSet res  = stmt.executeQuery(SQL);
            
            while(res.next())
            {
               libri.add(new Libro(res.getInt("IDL"),res.getString("Autore"),res.getString("Titolo"),res.getInt("Edizione")));
            }
            
       } catch (SQLException ex) 
       {
         gestisciErroreSQL(ex);
       }
       
       return libri;
       
    }
 private static ArrayList<Utente> getUtenti(Connection con)
    {
       String SQL = "SELECT * from utenti;";
       
       ArrayList<Utente> utenti = new ArrayList<>();
               
       try 
       {
            Statement stmt = con.createStatement();
            ResultSet res  = stmt.executeQuery(SQL);
            
            while(res.next())
            {
               utenti.add(new Utente(res.getInt("IDU"),res.getString("nominativo"),res.getString("Indirizzo")));
            }
            
       } catch (SQLException ex) 
       {
          gestisciErroreSQL(ex);
       }
       
       return utenti;
       
    }
 
 //HO 3 METODO OVERLOADATI PER LE 3 SELECT SUI PRESTITI
 //TUTTI I PRESTITI
 private static ArrayList<Prestito> getPrestiti(Connection con)
    {
       String SQL = "SELECT * from libri inner join utenti on libri.IDU = utenti.IDU order by IDL;";
       
       return getPrestitiSQL(con,SQL);
       
    }
 //TUTTI I PRESTITI DELL'UTENTE
  private static ArrayList<Prestito> getPrestiti(Connection con,Utente utente)
    {
       String SQL = "SELECT * from libri inner join utenti on libri.IDU = utenti.IDU where utenti.IDU = "+utente.getID()+";";
       
       return getPrestitiSQL(con,SQL);
       
    }
  //cerco x alcuni parametri ugiualgianza stretta ma potrei fare wildc.., non ID, dovevo aggiunger ISBN a fare bene ma non c'era nell'esercizio...
   private static ArrayList<Prestito> getPrestiti(Connection con,Libro libro)
    {
       String SQL = "SELECT * from libri inner join utenti on libri.IDU = utenti.IDU where libri.Autore = '"+libro.getAutore()+"' AND libri.Edizione="+ libro.getEdizione() +" AND libri.Titolo='"+libro.getTitolo()+"';";
       
        return getPrestitiSQL(con,SQL);
       
    }
   
     private static ArrayList<Prestito> getPrestitiSQL(Connection con,String SQL)
    {
       ArrayList<Prestito> prestiti = new ArrayList<>();
               
       try 
       {
            Statement stmt = con.createStatement();
            ResultSet res  = stmt.executeQuery(SQL);
            
            while(res.next())
            {
               Utente u   = new Utente(res.getInt("IDU"),res.getString("nominativo"),res.getString("Indirizzo"));
               Libro l    = new Libro(res.getInt("IDL"),res.getString("Autore"),res.getString("Titolo"),res.getInt("Edizione"));
               Prestito p = new Prestito(res.getString("DataP"),u,l);
               
               prestiti.add(p);
            }
            
       } catch (SQLException ex) 
       {
         gestisciErroreSQL(ex);
       }
       
       return prestiti;
    }
 private static boolean remPrestito(Connection con,Prestito p) throws BibliotecaException
    {
     
       String SQL = "UPDATE libri SET DataP=NULL,IDU=NULL WHERE IDL = ? AND IDU = ? AND DataP = ?";
       try 
       {
           //non ho biisogno di risultset
           
           //QUESTA VOLTA USO I PREPARED STATEMENT
           //uso prepareStatemente anzichè create
    
            PreparedStatement stmt = con.prepareStatement(SQL);
            
            stmt.setInt(1, p.getLibro().getID());
            stmt.setInt(2, p.getUtente().getID());
            stmt.setString(3, p.getData());
           
            int nr = stmt.executeUpdate();
         
            if(nr > 1)
            {
              throw new BibliotecaException("Lo statement \n" + SQL + "\n" + "doveva aggiornare 1 record anzichè " + nr);
            }
            
            //potrebbe essere un update da informazione 
            //non sincronizzate con il db
            return (nr == 1);

       }
       catch (SQLException ex) 
       {
         gestisciErroreSQL(ex);
       }
         return false;
    }
 
    private static boolean addPrestito(Connection con,Prestito p,int maxP) throws BibliotecaException
    {
       //MACHECCAZOOOOOOOOOO??????
        //NON SONO AFFATTO CONVINTO DI QQUESTA SBRODOLATA DI CARATTERI
       String SQL = "UPDATE libri SET DataP=now(),IDU=? WHERE IDL IN "
                   + "("
                       + " SELECT IDL"
                        + " FROM (SELECT * from libri FOR UPDATE) AS L1"
                          + " WHERE"
                           +" ? > (SELECT count(*) from (SELECT * from libri) AS L1 WHERE L1.IDU = ? FOR UPDATE) FOR UPDATE"
                   + ")"
                   + " AND IDL = ? AND IDU IS NULL AND DataP is NULL"
                   + ";";
     
       try 
       {
           //non ho biisogno di risultset
           
           //QUESTA VOLTA USO I PREPARED STATEMENT
           //uso prepareStatemente anzichè create
    
            PreparedStatement stmt = con.prepareStatement(SQL);
            
           
            stmt.setInt(1, p.getUtente().getID());
            stmt.setInt(2, maxP);
            stmt.setInt(3, p.getUtente().getID());
            stmt.setInt(4, p.getLibro().getID());
           
            
            int nr = stmt.executeUpdate();
         
            if(nr > 1)
            {
                //QUA IL DB E' IN FRITTATA
              throw new BibliotecaException("Lo statement \n" + SQL + "\n" + "doveva aggiornare 1 record anzichè " + nr);
            }
            
            //potrebbe essere un update da informazione 
            //non sincronizzate con il db
            return (nr == 1);

       }
       catch (SQLException ex) 
       {
         gestisciErroreSQL(ex);
       }
      return false;
    }
    private static void gestisciErroreSQL(SQLException ex)
    {
           System.out.println(ex);
    }

    
    //DA QUI IMPLENTO L'INTERFACCIA
    private Connection conn;
    private static final int MAX_LIBRI_UTENTE = 5;
    
    public BibliotecaCasalinga() throws BibliotecaException
    {
      if((conn = connect()) == null)
       {
        throw new BibliotecaException();
       }
    }

    @Override
    public ArrayList<Libro> getLibri()
    {
       return getLibri(conn);
    }

    @Override
    public ArrayList<Prestito> getPrestiti() 
    {
        return getPrestiti(conn);
    }

    @Override
    public ArrayList<Prestito> getPrestiti(Libro libro)
    {
       return getPrestiti(conn,libro);
    }

    @Override
    public ArrayList<Prestito> getPrestiti(Utente utente)
    {
         return getPrestiti(conn,utente);
    }
    
    @Override
    public ArrayList<Utente> getUtenti() 
    {
       return getUtenti(conn);
    }

    //QUESTA GIGIATA PERMETTE L'AUTO CLOSURE!!!
    @Override
    public void close()
    {
        if(conn!=null)
        {
          disconnect(conn);
        }
    }

    @Override
    public int getPrestitoMassimo()
    {
       return MAX_LIBRI_UTENTE;
    }

    @Override
    public boolean remPrestito(Prestito p) throws BibliotecaException
    {
        // if (true) throw new BibliotecaException("TEST BAD ERRORS");
        return remPrestito(conn,p);
      
    }
    @Override
    public boolean addPrestito(Prestito p) throws BibliotecaException
    {
        // if (true) throw new BibliotecaException("TEST BAD ERRORS");
        return addPrestito(conn,p,getPrestitoMassimo());
      
    }
  
   //INNER CLASS PER E CCEZIONI CUSTOM , DEVE ESSERE STATITICA PER  ESISTERE FUORI DALL'ISTANZA SENZA COSTRUIRLA
    //MA IMPLEMENTA COMUNQUE LA CLASSE ASTRATTA
   public static class BibliotecaException extends ABibliotecaException
   {
       //FORSE DOPO UN CAFFETTINO SI RIPIGLIA
       private String MESSAGE = "La biblioteca è momentanamente fuori servizio, andate al bar!";
       public BibliotecaException()
       {}
        public BibliotecaException(String message)
       {
         MESSAGE = message;
       }
       @Override
       public String toString()
       {
        return MESSAGE;
       }
   }
   
}
