/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alessandro
 */
public class FinestraBiblioteca extends javax.swing.JFrame implements Aggiornabile {

    
    private boolean warningEnabled;
    private boolean errorEnabled;

    /**
     * Creates new form FinestraBiblioteca
     */
    public FinestraBiblioteca() 
    {
        warningEnabled = ComandiBiblioteca.DEFAULT_WARNING;
        errorEnabled   = ComandiBiblioteca.DEFAULT_ERROR;
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSPrestitiEast = new javax.swing.JScrollPane();
        jPrestiti = new javax.swing.JTable();
        jSouthPanel = new javax.swing.JPanel();
        jShowBooks = new javax.swing.JButton();
        jShowUsers = new javax.swing.JButton();
        jAddPrestito = new javax.swing.JButton();
        jShowBooksByUser = new javax.swing.JButton();
        jShowBooksByBook = new javax.swing.JButton();
        jShowBooksByUsers = new javax.swing.JButton();
        jShowBook = new javax.swing.JButton();
        jRemovePrestito = new javax.swing.JButton();
        jCenterPanel = new javax.swing.JPanel();
        jSUtentiCenterUp = new javax.swing.JScrollPane();
        jUsers = new javax.swing.JTable();
        jSLibriCenterDown = new javax.swing.JScrollPane();
        jBooks = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(ComandiBiblioteca.SUPER_SECRETE_NAME);
        setPreferredSize(new java.awt.Dimension(850, 500));

        jSPrestitiEast.setPreferredSize(new java.awt.Dimension(410, 450));

        jPrestiti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null}
            },
            new String []
            {
                "IDL", "Data" , "Nominativo","Indirizzo",""
            }
        ));
        jSPrestitiEast.setViewportView(jPrestiti);

        getContentPane().add(jSPrestitiEast, java.awt.BorderLayout.EAST);

        jSouthPanel.setPreferredSize(new java.awt.Dimension(600, 50));
        jSouthPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jShowBooks.setText(ComandiBiblioteca.GET_LIBRI);
        jShowBooks.setToolTipText("");
        jSouthPanel.add(jShowBooks);

        jShowUsers.setText(ComandiBiblioteca.GET_UTENTI);
        jShowUsers.setToolTipText("");
        jSouthPanel.add(jShowUsers);

        jAddPrestito.setText(ComandiBiblioteca.ADD_PRESTITO_UTENTE);
        jAddPrestito.setToolTipText("");
        jSouthPanel.add(jAddPrestito);

        jShowBooksByUser.setText(ComandiBiblioteca.GET_PRESTITI_UTENTE);
        jSouthPanel.add(jShowBooksByUser);

        jShowBooksByBook.setText(ComandiBiblioteca.GET_PRESTITI_LIBRO);
        jSouthPanel.add(jShowBooksByBook);

        jShowBooksByUsers.setText(ComandiBiblioteca.GET_PRESTITI);
        jSouthPanel.add(jShowBooksByUsers);

        jShowBook.setText(ComandiBiblioteca.GET_LIBRO);
        jShowBook.setToolTipText("");
        jSouthPanel.add(jShowBook);

        jRemovePrestito.setText(ComandiBiblioteca.REM_PRESTITO_UTENTE);
        jRemovePrestito.setToolTipText("");
        jSouthPanel.add(jRemovePrestito);

        getContentPane().add(jSouthPanel, java.awt.BorderLayout.SOUTH);

        jCenterPanel.setLayout(new javax.swing.BoxLayout(jCenterPanel, javax.swing.BoxLayout.Y_AXIS));

        jSUtentiCenterUp.setPreferredSize(new java.awt.Dimension(410, 200));

        jUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "IDU", "Nominativo", "Indirizzo"
            }
        ));
        jSUtentiCenterUp.setViewportView(jUsers);

        jCenterPanel.add(jSUtentiCenterUp);

        jSLibriCenterDown.setPreferredSize(new java.awt.Dimension(410, 200));

        jBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "IDL", "Autore", "Titolo", "Edizione"
            }
        ));
        jSLibriCenterDown.setViewportView(jBooks);

        jCenterPanel.add(jSLibriCenterDown);

        getContentPane().add(jCenterPanel, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAddPrestito;
    private javax.swing.JTable jBooks;
    private javax.swing.JPanel jCenterPanel;
    private javax.swing.JTable jPrestiti;
    private javax.swing.JButton jRemovePrestito;
    private javax.swing.JScrollPane jSLibriCenterDown;
    private javax.swing.JScrollPane jSPrestitiEast;
    private javax.swing.JScrollPane jSUtentiCenterUp;
    private javax.swing.JButton jShowBook;
    private javax.swing.JButton jShowBooks;
    private javax.swing.JButton jShowBooksByBook;
    private javax.swing.JButton jShowBooksByUser;
    private javax.swing.JButton jShowBooksByUsers;
    private javax.swing.JButton jShowUsers;
    private javax.swing.JPanel jSouthPanel;
    private javax.swing.JTable jUsers;
    // End of variables declaration//GEN-END:variables

    //LA FINESTRA DEVE IMPLEMENTARE QUESTI 2 METODI PER ESSERE REATTIVA CON L'ESTERNO
    @Override
    public void addListener(ActionListener listener) 
    {
       //ASSOCIO TUTTI I CONTROLLI CHE POSSONO FAR SCATURIRE UN'AZIONE QUA DETRO
       this.jShowBook.addActionListener(listener);
       this.jShowBooks.addActionListener(listener);
       this.jShowUsers.addActionListener(listener);
       this.jShowBooksByUsers.addActionListener(listener);
       this.jShowBooksByUser.addActionListener(listener);
       this.jShowBooksByBook.addActionListener(listener);
       this.jRemovePrestito.addActionListener(listener);
       this.jAddPrestito.addActionListener(listener);
        //accoppio il listener della tabella con l'actionlistener globale
       this.jUsers.getSelectionModel().addListSelectionListener(new ListSelectionListener()
         {
          private ActionListener listlistener = listener;
           @Override
           public void valueChanged(ListSelectionEvent e)
           {
               int row =  jUsers.getSelectedRow();
               //una selezione valida parte da 0
               if(row >= 0)
               {
                 //doppio controllo
                 Object sel = jUsers.getValueAt(row, 0);
                 if(sel!=null)
                 {
                  Utente selezionato = new Utente((int)sel);
                  //non mi si dovrebbe spaccare niente qua, il terzo parametro è il comando
                  ActionEvent evt = new ActionEvent(selezionato,0,ComandiBiblioteca.SEL_UTENTE);
                  //invoco a mano l'evento action performed, quello che vine lanciato
                  //da tutti i pulsanti onclick
                  listlistener.actionPerformed(evt);
               }
               }
           }
               
               }
       );
       
       //stessa cosa per i libri
       this.jBooks.getSelectionModel().addListSelectionListener(new ListSelectionListener()
               {
                   private ActionListener listlistener = listener;
           @Override
           public void valueChanged(ListSelectionEvent e)
           {
               int row =  jBooks.getSelectedRow();
               //una selezione valida parte da 0
               if(row >= 0)
               {
                 //doppio controllo
                 Object sel = jBooks.getValueAt(row, 0);
                 if(sel!=null)
                 {
                 Libro selezionato = new Libro((int)sel,(String)jBooks.getValueAt(row, 1),(String)jBooks.getValueAt(row, 2),(int)jBooks.getValueAt(row, 3));
                 //non mi si dovrebbe spaccare niente qua
                 ActionEvent evt = new ActionEvent(selezionato,0,ComandiBiblioteca.SEL_LIBRO);
                 //invoco a mano l'evento action performed, quello che vine lanciato
                 //da tutti i pulsanti onclick
                 listlistener.actionPerformed(evt);
      
               }
               }
           }
               
               }
       );
       
         //stessa cosa per i prestiti
       this.jPrestiti.getSelectionModel().addListSelectionListener(new ListSelectionListener()
               {
                   private ActionListener listlistener = listener;
           @Override
           public void valueChanged(ListSelectionEvent e)
           {
               int row =  jPrestiti.getSelectedRow();
               //una selezione valida parte da 0
               if(row >= 0)
               {
                 //doppio controllo
                 Object sel = jPrestiti.getValueAt(row, 0);
                 if(sel!=null)
                 {
                 int idl           = (Integer)sel;
                 String data       = (String)jPrestiti.getValueAt(row, 1);
                 int idu           = (Integer)jPrestiti.getValueAt(row, 4);
                 //creo un prestito da rimuovere
                 Prestito p        = new Prestito(data,idu,idl);
                 //non mi si dovrebbe spaccare niente qua
                 ActionEvent evt = new ActionEvent(p,0,ComandiBiblioteca.SEL_PRESTITO);
                 //invoco a mano l'evento action performed, quello che vine lanciato
                 //da tutti i pulsanti onclick
                 listlistener.actionPerformed(evt);
      
               }
               }
           }
               
           }
       );
       
    }
    
    //metodo di interfaccia aggiornabile
    //quandio i dati sono pronti per essere visualizzati il metodo
    //update viene lanciato (con i dati si spera :), dovrei smarmellarci un dato sano ancziche un pericoloso object)
    //si potrebbe fare specificando le singole update
    @Override
    public void update(ActionEvent e, Object data) 
    {
    
      
      if(data == null)
      {
          if(warningEnabled)
          {
          JOptionPane.showMessageDialog(this, " Si è verificato un problema" 
                  +"\nNella gestione dell'azione"
                  +"\n"+e.getActionCommand(),
                  "Attenzione",
                  JOptionPane.WARNING_MESSAGE);
          }
          return;
      }
      
       if(data instanceof Exception)
      {
          
           if(errorEnabled)
          {
          JOptionPane.showMessageDialog(this, " Si è verificato un Errore" 
                  +"\nNella gestione dell'azione"
                  +"\n"+e.getActionCommand()
                  +"\n"+((Exception)data),
                  "Errore",
                  JOptionPane.ERROR_MESSAGE);
          }
          return;
      }
      
      switch(e.getActionCommand())
      {
          case ComandiBiblioteca.GET_LIBRI :   
              
                           ArrayList<Libro> libri = (ArrayList<Libro>)data;
                           //serve per pulire la tabella
                           ((DefaultTableModel)this.jBooks.getModel()).setRowCount(0);
                           //inserisco i risultati, ma dovrei farlo in una botta e via(un bulk)
                           for(Libro l: libri)
                           {
                               ((DefaultTableModel)this.jBooks.getModel()).addRow(l.toTableRow());
                           }
                           break;
          case ComandiBiblioteca.GET_LIBRO :   
              
                           Libro libro = (Libro)data;
                            if(libro!= null)
                            {
                              JOptionPane.showMessageDialog(this, libro, ComandiBiblioteca.GET_LIBRO,JOptionPane.INFORMATION_MESSAGE);
                            }
                           break;
          case ComandiBiblioteca.GET_UTENTI :   
              
                           ArrayList<Utente> utenti = (ArrayList<Utente>)data;
                           ((DefaultTableModel)this.jUsers.getModel()).setRowCount(0);
                            //inserisco i risultati,ma dovrei farlo in una botta via(un bulk)
                           for(Utente u: utenti)
                           {
                               ((DefaultTableModel)this.jUsers.getModel()).addRow(u.toTableRow());
                           }
                           break;   
            //potrebbero non esserci piu libri in prestito
         case ComandiBiblioteca.GET_PRESTITI :   
         case ComandiBiblioteca.GET_PRESTITI_LIBRO : 
         case ComandiBiblioteca.GET_PRESTITI_UTENTE : 
              
             
                           ArrayList<Prestito> prestiti = (ArrayList<Prestito>)data;
                           ((DefaultTableModel)this.jPrestiti.getModel()).setRowCount(0);
                            //inserisco i risultati, ma dovrei farlo in una botta via(un bulk)
                           for(Prestito p: prestiti)
                           {
                               ((DefaultTableModel)this.jPrestiti.getModel()).addRow(p.toTableRow());
                           }
                           break;
        case ComandiBiblioteca.ADD_PRESTITO_UTENTE :                     
        case ComandiBiblioteca.REM_PRESTITO_UTENTE :  
            
                            ArrayList<Prestito> prestitiDopoOp = (ArrayList<Prestito>)data;
                           ((DefaultTableModel)this.jPrestiti.getModel()).setRowCount(0);
                            //inserisco i risultati, ma dovrei farlo in una botta via
                           for(Prestito p: prestitiDopoOp)
                           {
                               ((DefaultTableModel)this.jPrestiti.getModel()).addRow(p.toTableRow());
                           }
                           //oltre sll'sggiornament dei prestiti aggiorno la tabella 
                           //libri
                           this.jShowBooks.doClick();
                           break;                    
                               
          default: break;
      
      }
      
     
    }
     
}
