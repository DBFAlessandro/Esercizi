package biblio;

//ci metto tutti i comandi dell'applicazione

public class ComandiBiblioteca 
{
    
    
    public static final String GET_LIBRO               = "Libro";
    public static final String GET_LIBRI               = "Libri";
    public static final String GET_UTENTI              = "Utenti";
    public static final String GET_PRESTITI            = "PrestitiTutti";
    public static final String GET_PRESTITI_UTENTE     = "PrestitiUtente";
    public static final String GET_PRESTITI_LIBRO      = "PrestitiLibro";
    public static final String SEL_UTENTE              = "SelezioneUtente";
    public static final String SEL_LIBRO               = "SelezioneLibro";
    public static final String SEL_PRESTITO            = "SelezionePrestito";
    public static final String ADD_PRESTITO_UTENTE     = "PrendiLibro";
    public static final String REM_PRESTITO_UTENTE     = "RestituisciLibro";
    public static final String SUPER_SECRETE_NAME      = "LA BIBLIOTECA DOMESTICA";
    
    
    //cambiare questa per eventuali messaggi
    public static final boolean DEFAULT_WARNING = false;
    public static final boolean DEFAULT_ERROR   = true;

    
    //SPECIFICHE DI CONNESSIONE
    public static final String SQLITE3 = "SQLITE3";
    public static final String MYSQL8  = "MYSQL8";
    public static final String SUPER_SECRET_CONNECTION_01 = "jdbc:mysql://localhost:3306/biblioteca?zeroDateTimeBehavior=convertToNull&serverTimezone=UTC";
    public static final String SUPER_SECRET_CONNECTION_02 = "jdbc:sqlite:biblioteca.db";
   
    //SPECIFICHE DI AUTENTICAZIONE SULLA CONNESSIONE
    public static final String SUPER_SECRET_USER       = "root";
    public static final String SUPER_SECRET_PWD        = "root";

    //CAMBIARE QUESTO SET X TESTARE SU SQLLITE3
    //DEFAULT IL DB DA RISORSE ESTERNE VA MESSO NELLA WORKINK DIR
    public static final String DRIVER = MYSQL8;
    
    
    public static final String SUPER_SECRET_CONNECTION = DRIVER.equals(SQLITE3) ? SUPER_SECRET_CONNECTION_02 : SUPER_SECRET_CONNECTION_01;
}
