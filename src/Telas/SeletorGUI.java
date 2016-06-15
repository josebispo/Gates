
package Telas;

import LeitorCSV.LeitorCsv;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;


public class SeletorGUI extends javax.swing.JFrame {

    public static String leitor;
    
    public  SeletorGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seletor = new javax.swing.JFileChooser();
        text = new javax.swing.JTextField();
        procurar = new javax.swing.JButton();
        OK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        procurar.setText("Procurar");
        procurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarActionPerformed(evt);
            }
        });

        OK.setText("OK");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OK))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(procurar)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(procurar))
                .addGap(18, 18, 18)
                .addComponent(OK)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void procurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarActionPerformed
        JFileChooser file = new JFileChooser(); 
          file.setFileSelectionMode(JFileChooser.FILES_ONLY);
          int i= file.showSaveDialog(null);
        if (i==1){
            text.setText("");
        } else {
            File arquivo = file.getSelectedFile();
           text.setText(arquivo.getAbsolutePath());

        SeletorGUI.leitor=(arquivo.getAbsolutePath());
            try {
                LeitorCsv.Leitor();
                //System.out.println(LeitorCsv.arquivoCSV);  
            } catch (IOException ex) {
                Logger.getLogger(SeletorGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_procurarActionPerformed
    }
    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
       
        System.exit(0);
            
    }//GEN-LAST:event_OKActionPerformed
      
    
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
            java.util.logging.Logger.getLogger(SeletorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeletorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeletorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeletorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeletorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OK;
    private javax.swing.JButton procurar;
    private javax.swing.JFileChooser seletor;
    private javax.swing.JTextField text;
    // End of variables declaration//GEN-END:variables
}
