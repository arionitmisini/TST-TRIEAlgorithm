/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.*;
import java.io.BufferedWriter;
/**
 *
 * @author Arioniti
 */
public class AppMain extends javax.swing.JFrame {
    private int count=0;
    TST <Integer>st=new TST<Integer>();
    TrieST<Integer> tst = new TrieST<Integer>();
    /**
     * Creates new form AppMain
     */
    public AppMain() {
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

        addFjala = new javax.swing.JScrollPane();
        ListaFjaleve = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        SearchLista = new javax.swing.JTextArea();
        shtoFjala = new javax.swing.JTextField();
        Shto = new javax.swing.JButton();
        searchFjala = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        SearchListaTrie = new javax.swing.JTextArea();
        searchFjalaTrie = new javax.swing.JTextField();
        FshijeListen = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TST and TrieST Algorithm");

        ListaFjaleve.setEditable(false);
        ListaFjaleve.setColumns(20);
        ListaFjaleve.setRows(5);
        addFjala.setViewportView(ListaFjaleve);

        SearchLista.setEditable(false);
        SearchLista.setColumns(20);
        SearchLista.setRows(5);
        jScrollPane2.setViewportView(SearchLista);

        shtoFjala.setForeground(new java.awt.Color(153, 153, 153));
        shtoFjala.setText("Shkruaj fjalen qe deshiron te shtohet ...");
        shtoFjala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shtoFjalaMouseClicked(evt);
            }
        });
        shtoFjala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shtoFjalaActionPerformed(evt);
            }
        });

        Shto.setText("Shto ");
        Shto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShtoActionPerformed(evt);
            }
        });

        searchFjala.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                searchFjalaInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        searchFjala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFjalaActionPerformed(evt);
            }
        });
        searchFjala.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFjalaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchFjalaKeyTyped(evt);
            }
        });

        SearchListaTrie.setEditable(false);
        SearchListaTrie.setColumns(20);
        SearchListaTrie.setRows(5);
        jScrollPane1.setViewportView(SearchListaTrie);

        searchFjalaTrie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFjalaTrieActionPerformed(evt);
            }
        });
        searchFjalaTrie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFjalaTrieKeyReleased(evt);
            }
        });

        FshijeListen.setText("Fshije Listen");
        FshijeListen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FshijeListenActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tst/trieST.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tst/TST.png"))); // NOI18N

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jButton1.setText("Open text from file");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("©ArionitMisini");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tst/studentinformation_housingfair_button.png"))); // NOI18N
        jLabel5.setToolTipText("");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addFjala, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(shtoFjala, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Shto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FshijeListen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchFjala)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(searchFjalaTrie, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(shtoFjala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchFjala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchFjalaTrie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FshijeListen)
                    .addComponent(Shto))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                    .addComponent(addFjala))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void shtoFjalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shtoFjalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shtoFjalaActionPerformed

    private void ShtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShtoActionPerformed
    if(count==0){
        JOptionPane.showMessageDialog(null,"Nuk keni shkruar asnje fjale!","Gabim",JOptionPane.WARNING_MESSAGE);}
    else{    String fjala=shtoFjala.getText();
        if(shtoFjala.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Nuk keni shkruar asnje fjale!","Gabim",JOptionPane.WARNING_MESSAGE);
        }
        else{
            ListaFjaleve.append(fjala+"\n");
            shtoFjala.setText("");
        }
       }           
    }//GEN-LAST:event_ShtoActionPerformed

    private void searchFjalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFjalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFjalaActionPerformed

    private void searchFjalaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_searchFjalaInputMethodTextChanged
    }//GEN-LAST:event_searchFjalaInputMethodTextChanged

    private void searchFjalaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFjalaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFjalaKeyTyped

    private void searchFjalaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFjalaKeyReleased
        SearchLista.setText(null);
        if(ListaFjaleve.getText().isEmpty()){
             JOptionPane.showMessageDialog(null,
            "Nuk ka asnje fjale ne liste!",
            "Gabim",
            JOptionPane.WARNING_MESSAGE);
        }
        if(!ListaFjaleve.getText().isEmpty()){
            String []fjalet=ListaFjaleve.getText().split("\n");
            for(int i=0;i<fjalet.length;i++){
            String key=fjalet[i];
            st.put(key,i);
          }
        }
        for (String s : st.keysWithPrefix(searchFjala.getText()))
            SearchLista.append(s+"\n");
    }//GEN-LAST:event_searchFjalaKeyReleased

    private void searchFjalaTrieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFjalaTrieActionPerformed
       
    }//GEN-LAST:event_searchFjalaTrieActionPerformed

    private void FshijeListenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FshijeListenActionPerformed
        if(!ListaFjaleve.getText().isEmpty())    
           ListaFjaleve.setText("");
        else if(ListaFjaleve.getText().isEmpty())
             JOptionPane.showMessageDialog(null,"Nuk ka asnje fjale ne liste!");
            
    }//GEN-LAST:event_FshijeListenActionPerformed

    private void searchFjalaTrieKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFjalaTrieKeyReleased
    SearchListaTrie.setText(null);
        if(ListaFjaleve.getText().isEmpty()){
             JOptionPane.showMessageDialog(null,
            "Nuk ka asnje fjale ne liste!",
            "Gabim",
            JOptionPane.WARNING_MESSAGE);
        }
        if(!ListaFjaleve.getText().isEmpty()){
            String []fjalet=ListaFjaleve.getText().split("\n");
            for(int i=0;i<fjalet.length;i++){
            String key=fjalet[i];
            st.put(key,i);
          }
        }
        for (String s : st.keysWithPrefix(searchFjalaTrie.getText()))
            SearchListaTrie.append(s+"\n");
    }//GEN-LAST:event_searchFjalaTrieKeyReleased

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        JOptionPane.showMessageDialog(null,"Ky aplikacion u punua nga : Arioniti Misini \nID : 151635881\nGR : 2A");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ListaFjaleve.setText(null);
        JOptionPane.showMessageDialog(null,"Fajlli duhet te jete TEXT!");
        JFileChooser zgjedh = new JFileChooser();
        zgjedh.setPreferredSize(new Dimension(800,500));
        zgjedh.showOpenDialog(null);
        File f=zgjedh.getSelectedFile();
       try{
           String fjala="";
           if(f.getName().endsWith(".txt")){
            BufferedReader br=new BufferedReader(new FileReader (zgjedh.getSelectedFile()));
            String line=null;
            while((line= br.readLine()) != null){
                     ListaFjaleve.append(line+"\n");
                }
           }
           else{
                JOptionPane.showMessageDialog(null,"Fajlli qe eshte zgjedhur nuk eshte TEXT!","Gabim",JOptionPane.WARNING_MESSAGE);
              }
           String[]splitFjalet=ListaFjaleve.getText().split(" ");
           ListaFjaleve.setText(null);
           for(int i=0;i<splitFjalet.length;i++){
               ListaFjaleve.append(splitFjalet[i]+"\n");
           }
        }
       catch(IOException i){}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void shtoFjalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shtoFjalaMouseClicked
       if(count==0&&count<2) {
          shtoFjala.setText(null);
          count++;
          shtoFjala.setFont(new Font("Tahoma", Font.PLAIN,13));
          shtoFjala.setForeground(Color.black);
       }
    }//GEN-LAST:event_shtoFjalaMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
            JOptionPane.showMessageDialog(null,"Studenti : Arionit Misini\nID : 151635881\nGR : 2A","Informacione mbi studentin",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jLabel5MouseClicked
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
            java.util.logging.Logger.getLogger(AppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FshijeListen;
    private javax.swing.JTextArea ListaFjaleve;
    private javax.swing.JTextArea SearchLista;
    private javax.swing.JTextArea SearchListaTrie;
    private javax.swing.JButton Shto;
    private javax.swing.JScrollPane addFjala;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField searchFjala;
    private javax.swing.JTextField searchFjalaTrie;
    private javax.swing.JTextField shtoFjala;
    // End of variables declaration//GEN-END:variables

}
