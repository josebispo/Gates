/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

/**
 *
 * @author Jose Bispo
 */
public class frmlogin extends javax.swing.JFrame {

    /**
     * Creates new form frmlogin
     */
    public frmlogin() {
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

        jLabelUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jButtonAcessar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuário");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/MobileAppsDevelopment2.jpg"))); // NOI18N

        jLabelSenha.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSenha.setText("Senha");

        jButtonAcessar.setText("Acessar");

        jButtonSair.setText("Sair");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N

        jPasswordFieldSenha.setText("jPasswordField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelUsuario)
                .addGap(431, 431, 431)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSenha)
                .addGap(0, 0, 0)
                .addComponent(jButtonAcessar)
                .addGap(0, 0, 0)
                .addComponent(jButtonSair)
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(563, 563, 563)
                .addComponent(jLabelUsuario))
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(563, 563, 563)
                .addComponent(jLabelSenha))
            .addGroup(layout.createSequentialGroup()
                .addGap(560, 560, 560)
                .addComponent(jButtonAcessar))
            .addGroup(layout.createSequentialGroup()
                .addGap(560, 560, 560)
                .addComponent(jButtonSair))
            .addGroup(layout.createSequentialGroup()
                .addGap(524, 524, 524)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(561, 561, 561)
                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(561, 561, 561)
                .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcessar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
