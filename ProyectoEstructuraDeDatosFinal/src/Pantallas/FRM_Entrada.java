/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import Logica.DB_Usuarios;
import Logica.VerificarUsuario;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

/**
 *
 * @author ExtremeTech
 */
public class FRM_Entrada extends javax.swing.JFrame {

    private Image backgroundImage = Toolkit.getDefaultToolkit().getImage("C:\\Users\\ExtremeTech\\Desktop\\Adrián 2021\\Tercer Cuatrimestre Bachiller\\Estructura de datos\\Proyecto\\Github\\Estructura-de-datos\\ProyectoEstructuraDeDatosFinal\\src\\Contents\\frm_entrada.png");

    /**
     * Creates new form FRM_Entrada
     */
    public FRM_Entrada() {
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

        jBEntrar = new javax.swing.JButton();
        jBCrearUsuario = new javax.swing.JButton();
        jPassword = new javax.swing.JPasswordField();
        jTUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(950, 593));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBEntrar.setBackground(new java.awt.Color(255, 255, 255));
        jBEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/Botón Entrar.png"))); // NOI18N
        jBEntrar.setBorder(null);
        jBEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jBEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, 140, 40));

        jBCrearUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jBCrearUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/Botón Crear Usuario.png"))); // NOI18N
        jBCrearUsuario.setBorder(null);
        jBCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrearUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jBCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, 140, 40));

        jPassword.setBackground(new java.awt.Color(168, 205, 122));
        jPassword.setBorder(null);
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 422, 270, 30));

        jTUsuario.setBackground(new java.awt.Color(168, 205, 122));
        jTUsuario.setBorder(null);
        getContentPane().add(jTUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 352, 270, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/frm_entrada.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearUsuarioActionPerformed

        //Se abre la pantalla de crear usuario, se desabilita el login
        FRM_CrearUsuario frm_CrearUsuario = new FRM_CrearUsuario();
        frm_CrearUsuario.setVisible(true);
        frm_CrearUsuario.toFront();
        this.dispose();
    }//GEN-LAST:event_jBCrearUsuarioActionPerformed

    private void jBEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntrarActionPerformed
        //Información ingresada
        String usuario = jTUsuario.getText();
        String contrasenna = new String(jPassword.getPassword());

        DB_Usuarios db_Usuarios = new DB_Usuarios();

        //Coprobar que pueden pasar
        VerificarUsuario verificarUsuario = db_Usuarios.verificarUsuario(usuario, contrasenna);

        if (verificarUsuario == null) {
            JOptionPane.showMessageDialog(null,"El nombre de usuario o la contraseña son incorectos");

        } else {
            FRM_AtraccionesCR frm_AtraccionesCR = new FRM_AtraccionesCR();
            this.setEnabled(false);
            frm_AtraccionesCR.setVisible(true);
            frm_AtraccionesCR.toFront();
        }


    }//GEN-LAST:event_jBEntrarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCrearUsuario;
    private javax.swing.JButton jBEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTUsuario;
    // End of variables declaration//GEN-END:variables
}
