/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcolatrice;

/**
 *
 * @author Corso
 */
public class Calcolatrice extends javax.swing.JFrame {

    private String inputCorrente;
    private String inputPrecedente;
    private String operazione;
    /**
     * Creates new form Calcolatrice
     */
    public Calcolatrice() {
        initComponents();
        inputCorrente   = "0";
        inputPrecedente = "0";
        operazione      = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pDisplay = new javax.swing.JPanel();
        tDisplayOld = new javax.swing.JTextField();
        tDisplay = new javax.swing.JTextField();
        tOperazione = new javax.swing.JTextField();
        pNumeri = new javax.swing.JPanel();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        bV = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bC = new javax.swing.JButton();
        pOperazioni = new javax.swing.JPanel();
        bDivisione = new javax.swing.JButton();
        bMoltiplicazione = new javax.swing.JButton();
        bAddizione = new javax.swing.JButton();
        bSottrazione = new javax.swing.JButton();
        bSegno = new javax.swing.JButton();
        bCalcola = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LA CALCOLATRICE");
        setMinimumSize(new java.awt.Dimension(37, 300));
        setPreferredSize(new java.awt.Dimension(200, 200));

        pDisplay.setBackground(new java.awt.Color(153, 153, 255));
        pDisplay.setLayout(new java.awt.BorderLayout());

        tDisplayOld.setEditable(false);
        tDisplayOld.setBackground(new java.awt.Color(153, 153, 255));
        tDisplayOld.setForeground(new java.awt.Color(0, 0, 0));
        tDisplayOld.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tDisplayOld.setText("0");
        tDisplayOld.setAlignmentX(1.0F);
        tDisplayOld.setBorder(null);
        pDisplay.add(tDisplayOld, java.awt.BorderLayout.PAGE_START);

        tDisplay.setEditable(false);
        tDisplay.setBackground(new java.awt.Color(153, 153, 255));
        tDisplay.setFont(new java.awt.Font("DejaVu Serif Condensed", 0, 38)); // NOI18N
        tDisplay.setForeground(new java.awt.Color(0, 0, 0));
        tDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tDisplay.setText("0");
        tDisplay.setAlignmentX(1.0F);
        tDisplay.setBorder(null);
        tDisplay.setMinimumSize(new java.awt.Dimension(14, 50));
        tDisplay.setPreferredSize(new java.awt.Dimension(21, 50));
        pDisplay.add(tDisplay, java.awt.BorderLayout.PAGE_END);

        tOperazione.setEditable(false);
        tOperazione.setBackground(new java.awt.Color(153, 153, 255));
        tOperazione.setForeground(new java.awt.Color(0, 0, 0));
        tOperazione.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tOperazione.setBorder(null);
        pDisplay.add(tOperazione, java.awt.BorderLayout.CENTER);

        getContentPane().add(pDisplay, java.awt.BorderLayout.PAGE_START);

        pNumeri.setLayout(new java.awt.GridLayout(4, 3));

        b7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        b7.setText("7");
        b7.setBorder(null);
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        pNumeri.add(b7);

        b8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        b8.setText("8");
        b8.setBorder(null);
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        pNumeri.add(b8);

        b9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        b9.setText("9");
        b9.setBorder(null);
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        pNumeri.add(b9);

        b4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        b4.setText("4");
        b4.setBorder(null);
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        pNumeri.add(b4);

        b5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        b5.setText("5");
        b5.setBorder(null);
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        pNumeri.add(b5);

        b6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        b6.setText("6");
        b6.setBorder(null);
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        pNumeri.add(b6);

        b1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        b1.setText("1");
        b1.setBorder(null);
        b1.setMaximumSize(new java.awt.Dimension(50, 50));
        b1.setMinimumSize(new java.awt.Dimension(50, 50));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        pNumeri.add(b1);

        b2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        b2.setText("2");
        b2.setBorder(null);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        pNumeri.add(b2);

        b3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        b3.setText("3");
        b3.setBorder(null);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        pNumeri.add(b3);

        bV.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        bV.setText(".");
        bV.setAlignmentX(0.5F);
        bV.setBorder(null);
        bV.setMaximumSize(new java.awt.Dimension(50, 50));
        bV.setMinimumSize(new java.awt.Dimension(50, 50));
        bV.setPreferredSize(new java.awt.Dimension(50, 50));
        bV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVActionPerformed(evt);
            }
        });
        pNumeri.add(bV);

        b0.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        b0.setText("0");
        b0.setAlignmentX(0.5F);
        b0.setBorder(null);
        b0.setMaximumSize(new java.awt.Dimension(50, 50));
        b0.setMinimumSize(new java.awt.Dimension(50, 50));
        b0.setPreferredSize(new java.awt.Dimension(50, 50));
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });
        pNumeri.add(b0);

        bC.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        bC.setText("C");
        bC.setAlignmentX(0.5F);
        bC.setBorder(null);
        bC.setMaximumSize(new java.awt.Dimension(50, 50));
        bC.setMinimumSize(new java.awt.Dimension(50, 50));
        bC.setPreferredSize(new java.awt.Dimension(50, 50));
        bC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCActionPerformed(evt);
            }
        });
        pNumeri.add(bC);

        getContentPane().add(pNumeri, java.awt.BorderLayout.CENTER);

        pOperazioni.setLayout(new javax.swing.BoxLayout(pOperazioni, javax.swing.BoxLayout.Y_AXIS));

        bDivisione.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bDivisione.setText("/");
        bDivisione.setBorder(null);
        bDivisione.setMaximumSize(new java.awt.Dimension(50, 50));
        bDivisione.setPreferredSize(new java.awt.Dimension(50, 50));
        bDivisione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDivisioneActionPerformed(evt);
            }
        });
        pOperazioni.add(bDivisione);

        bMoltiplicazione.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bMoltiplicazione.setText("*");
        bMoltiplicazione.setBorder(null);
        bMoltiplicazione.setMaximumSize(new java.awt.Dimension(50, 50));
        bMoltiplicazione.setPreferredSize(new java.awt.Dimension(50, 50));
        bMoltiplicazione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMoltiplicazioneActionPerformed(evt);
            }
        });
        pOperazioni.add(bMoltiplicazione);

        bAddizione.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bAddizione.setText("+");
        bAddizione.setBorder(null);
        bAddizione.setMaximumSize(new java.awt.Dimension(50, 50));
        bAddizione.setPreferredSize(new java.awt.Dimension(50, 50));
        bAddizione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddizioneActionPerformed(evt);
            }
        });
        pOperazioni.add(bAddizione);

        bSottrazione.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bSottrazione.setText("-");
        bSottrazione.setBorder(null);
        bSottrazione.setMaximumSize(new java.awt.Dimension(50, 50));
        bSottrazione.setPreferredSize(new java.awt.Dimension(50, 50));
        bSottrazione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSottrazioneActionPerformed(evt);
            }
        });
        pOperazioni.add(bSottrazione);

        bSegno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bSegno.setText("+/-");
        bSegno.setBorder(null);
        bSegno.setMaximumSize(new java.awt.Dimension(50, 50));
        bSegno.setPreferredSize(new java.awt.Dimension(50, 50));
        bSegno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSegnoActionPerformed(evt);
            }
        });
        pOperazioni.add(bSegno);

        bCalcola.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bCalcola.setText("=");
        bCalcola.setBorder(null);
        bCalcola.setMaximumSize(new java.awt.Dimension(50, 50));
        bCalcola.setPreferredSize(new java.awt.Dimension(50, 50));
        bCalcola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcolaActionPerformed(evt);
            }
        });
        pOperazioni.add(bCalcola);

        getContentPane().add(pOperazioni, java.awt.BorderLayout.LINE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
         if(inputCorrente.equals("0"))
        {
                inputCorrente = "1";
          }
         else
        inputCorrente += "1";
         aggiornaDisplay();
    }//GEN-LAST:event_b1ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
         if(!inputCorrente.equals("0"))
        {
                inputCorrente += "0";
          }
        
         aggiornaDisplay();
    }//GEN-LAST:event_b0ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
            if(inputCorrente.equals("0"))
        {
         inputCorrente = "2";
        }
        else
            
        inputCorrente += "2";
           aggiornaDisplay();
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
           if(inputCorrente.equals("0"))
        {
         inputCorrente = "3";
        }
        else
            
        inputCorrente += "3";
            aggiornaDisplay();
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
           if(inputCorrente.equals("0"))
        {
         inputCorrente = "4";
        }
        else
            
        inputCorrente += "4";
            aggiornaDisplay();
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if(inputCorrente.equals("0"))
        {
         inputCorrente = "5";
        }
        else
            
        inputCorrente += "5";
            aggiornaDisplay();
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
          if(inputCorrente.equals("0"))
        {
         inputCorrente = "6";
        }
        else
            
        inputCorrente += "6";
             aggiornaDisplay();
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
             if(inputCorrente.equals("0"))
        {
         inputCorrente = "7";
        }
        else
            
        inputCorrente += "7";
            aggiornaDisplay();
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
          if(inputCorrente.equals("0"))
        {
         inputCorrente = "8";
        }
        else
            
        inputCorrente += "8";
             aggiornaDisplay();
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        if(inputCorrente.equals("0"))
        {
         inputCorrente = "9";
        }
        else
            
        inputCorrente += "9";
             aggiornaDisplay();
    }//GEN-LAST:event_b9ActionPerformed

    private void bVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVActionPerformed
          if(!inputCorrente.contains("."))
          {
          inputCorrente += ".";
          }
           aggiornaDisplay();
    }//GEN-LAST:event_bVActionPerformed

    private void bCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCActionPerformed
        inputCorrente   = inputPrecedente;
        inputPrecedente = "0";
        operazione      = "";
        aggiornaDisplay();
    }//GEN-LAST:event_bCActionPerformed

    private void bDivisioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDivisioneActionPerformed
        //se vengo da altre operazioni calcolo i parziali
        if(operazione.length() > 0)
        {
          operazione      = "/";
          //uso l'evento del bottone calcola
          this.bCalcolaActionPerformed(evt);
        }
        //in ogni caso salvo l'operando e l'operazione
        operazione      = "/";
        memorizzaValore();
        aggiornaDisplay();
          
    }//GEN-LAST:event_bDivisioneActionPerformed

    private void bCalcolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcolaActionPerformed
     
         //PRECONDIZIONI: OPERAZIONE VALIDA E OPERANDI CORRETTI
         if(operazione.length() == 0 || inputCorrente.indexOf(".") == inputCorrente.length() - 1)
         {
           return;
         }
         
         //CONVERTO LE STRINGHEIN NUMERI
         Double risultato = new Double(0);
         double operando1 = Double.parseDouble(inputPrecedente);
         double operando2 = Double.parseDouble(inputCorrente);
         
         //CALCOLI
         switch(operazione)
         {
             case "+" : risultato = operando1 + operando2;
                        break;
             case "-" : risultato = operando1 - operando2;
                        break;
             case "*" : risultato = operando1 * operando2;
                        break;
             case "/" : risultato = operando1 / operando2;
                        break;
             default : break;
         }
         
      
         //ASSEGNO IL RISULTATO E RESETTO IL RESTO
         inputPrecedente = "0";
         inputCorrente   = "" + risultato;
         //non c'ho voglia di usare i formattatori
         if(inputCorrente.endsWith(".0"))
         {
             inputCorrente = inputCorrente.substring(0, inputCorrente.length() - 2);
         }
         
         operazione      = "";
        
         aggiornaDisplay();
        
    }//GEN-LAST:event_bCalcolaActionPerformed

    private void bMoltiplicazioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMoltiplicazioneActionPerformed
       //se vengo da altre operazioni calcolo i parziali
        if(operazione.length() > 0)
        {
          operazione      = "*";
          //uso l'evento del bottone calcola
          this.bCalcolaActionPerformed(evt);
        }
        //in ogni caso salvo l'operando e l'operazione
        operazione      = "*";
        memorizzaValore();
        aggiornaDisplay();
    }//GEN-LAST:event_bMoltiplicazioneActionPerformed

    private void bAddizioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddizioneActionPerformed
        //se vengo da altre operazioni calcolo i parziali
        if(operazione.length() > 0)
        {
          operazione      = "+";
          //uso l'evento del bottone calcola
          this.bCalcolaActionPerformed(evt);
        }
        //in ogni caso salvo l'operando e l'operazione
        operazione      = "+";
        memorizzaValore();
        aggiornaDisplay();
    }//GEN-LAST:event_bAddizioneActionPerformed

    private void bSottrazioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSottrazioneActionPerformed
        //se vengo da altre operazioni calcolo i parziali
        if(operazione.length() > 0)
        {
          operazione      = "-";
          //uso l'evento del bottone calcola
          this.bCalcolaActionPerformed(evt);
        }
        //in ogni caso salvo l'operando e l'operazione
        operazione      = "-";
        memorizzaValore();
        aggiornaDisplay();
    }//GEN-LAST:event_bSottrazioneActionPerformed

    private void bSegnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSegnoActionPerformed
        Double d = Double.parseDouble(inputCorrente);
        
        if(d == 0.0 || d.isNaN())
        {
          return;
        }
        
        inputCorrente = ""+-d;   
        aggiornaDisplay();
    }//GEN-LAST:event_bSegnoActionPerformed
    private void aggiornaDisplay()
    {
      tOperazione.setText(operazione);
      tDisplay.setText(inputCorrente);
      tDisplayOld.setText(inputPrecedente);
    }
    
    //memorizzo l'operando immesso
    private void memorizzaValore()
    {
        //il suo valore prende il posto del piu vecchio(in questo caso ho un buffer di solo 1 operando)
        inputPrecedente = inputCorrente;
        //resetto il corrente
        inputCorrente   = "0";
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calcolatrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calcolatrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calcolatrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calcolatrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calcolatrice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bAddizione;
    private javax.swing.JButton bC;
    private javax.swing.JButton bCalcola;
    private javax.swing.JButton bDivisione;
    private javax.swing.JButton bMoltiplicazione;
    private javax.swing.JButton bSegno;
    private javax.swing.JButton bSottrazione;
    private javax.swing.JButton bV;
    private javax.swing.JPanel pDisplay;
    private javax.swing.JPanel pNumeri;
    private javax.swing.JPanel pOperazioni;
    private javax.swing.JTextField tDisplay;
    private javax.swing.JTextField tDisplayOld;
    private javax.swing.JTextField tOperazione;
    // End of variables declaration//GEN-END:variables
}
