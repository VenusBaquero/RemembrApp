/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.Sesion;

import com.Sesion.modelo.logic.UsuarioLogic;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class FrmLogin extends javax.swing.JFrame {

    
    /**
     * Creates new form Login
     */
    public FrmLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    FrmLogin(FrmRegistrarUsuario aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        checkMostrarContraseña = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(51, 153, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel1.setText("Inicio de Sesión ");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel3.setText("Contraseña:");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel6.setText("Usuario:");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        bg.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 300, 30));

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        bg.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 300, 30));

        checkMostrarContraseña.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        checkMostrarContraseña.setText("Mostrar contraseña");
        checkMostrarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMostrarContraseñaActionPerformed(evt);
            }
        });
        bg.add(checkMostrarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 180, 20));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/SimboloAutismotransparente1.png"))); // NOI18N
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 510, 230));

        btnIngresar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        bg.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 120, 50));

        btnRegistrar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        bg.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 120, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      
    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void checkMostrarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMostrarContraseñaActionPerformed
        if (checkMostrarContraseña.isSelected()){
            txtContraseña.setEchoChar((char)0);
        }else{
            txtContraseña.setEchoChar('*');
        }
            
    }//GEN-LAST:event_checkMostrarContraseñaActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
       if(!txtUsuario.getText().isEmpty()&&!txtContraseña.getText().isEmpty()){
           if(UsuarioLogic.autentificar(txtUsuario.getText(), txtContraseña.getText())){
               JOptionPane.showMessageDialog(this, "Bienvenido a RemembrAppp");
               this.dispose();
            Sesion s= new Sesion ();
            s.setVisible(true);
            s.setLocationRelativeTo(null);
            this.setVisible(false);
               //FrmPaginaPrincipal frmPaginaPrincipal = new FrmPaginaPrincipal();
               //frmPaginaPrincipal.setVisible(true);
               
           }else{
               JOptionPane.showMessageDialog(this, "Usuario o Contraseña incorrectos");
           }
       }else{
         JOptionPane.showMessageDialog(this, "Falta ingresar Usuario o Contraseña");
       }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        FrmRegistrarUsuario frmRegistrarUsuario= new FrmRegistrarUsuario(this,true);
        frmRegistrarUsuario.setVisible(true);
        frmRegistrarUsuario.setLocationRelativeTo(null);
        this.setVisible(false);
                
               
        
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    /**
     * @param args the command line argument
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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JCheckBox checkMostrarContraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}