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
    public static int contadorReservas = 0;

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

        btn_Salir = new javax.swing.JButton();
        jBEntrar = new javax.swing.JButton();
        jBCrearUsuario = new javax.swing.JButton();
        jPassword = new javax.swing.JPasswordField();
        jTUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(950, 593));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Salir.setBackground(new java.awt.Color(107, 170, 28));
        btn_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/btn_Salir.png"))); // NOI18N
        btn_Salir.setBorder(null);
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 80, -1, -1));

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
        jPassword.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPassword.setText("Contraseña");
        jPassword.setBorder(null);
        jPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFocusGained(evt);
            }
        });
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 422, 270, 30));

        jTUsuario.setBackground(new java.awt.Color(168, 205, 122));
        jTUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTUsuario.setText("Nombre usuario");
        jTUsuario.setBorder(null);
        jTUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTUsuarioFocusGained(evt);
            }
        });
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

        //Comprobar que pueden pasar
        VerificarUsuario verificarUsuario = db_Usuarios.verificarUsuario("admin", "admin");

        if (verificarUsuario == null) {
            JOptionPane.showMessageDialog(null, "El nombre de usuario o la contraseña son incorectos");

        } else {
            
            this.dispose();
            
            FRM_AtraccionesCR frm_AtraccionesCR = new FRM_AtraccionesCR();
            frm_AtraccionesCR.setLocationRelativeTo(null);
            frm_AtraccionesCR.setVisible(true);
            
        }


    }//GEN-LAST:event_jBEntrarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed

        //Se cierra la pantalla y se termina el proceso. 
        this.dispose();
        
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void jTUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTUsuarioFocusGained
        jTUsuario.setText("");
    }//GEN-LAST:event_jTUsuarioFocusGained

    private void jPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFocusGained
        jPassword.setText("");
    }//GEN-LAST:event_jPasswordFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton jBCrearUsuario;
    private javax.swing.JButton jBEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTUsuario;
    // End of variables declaration//GEN-END:variables
}
