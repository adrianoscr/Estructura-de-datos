/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import Logica.DB_Usuarios;
import Logica.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author ExtremeTech
 */
public class FRM_CrearUsuario extends javax.swing.JFrame {

    /**
     * Creates new form FRM_CrearUsuario
     */
    public FRM_CrearUsuario() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPwd_ConfirmarContrasenna = new javax.swing.JPasswordField();
        jPwd_Contrasenna = new javax.swing.JPasswordField();
        jBConfirmar = new javax.swing.JButton();
        jTXT_CorreoElectronico = new javax.swing.JTextField();
        jTXT_CrearUsuario = new javax.swing.JTextField();
        jLFondoCrearUsuario = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPwd_ConfirmarContrasenna.setBackground(new java.awt.Color(168, 205, 122));
        jPwd_ConfirmarContrasenna.setBorder(null);
        getContentPane().add(jPwd_ConfirmarContrasenna, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 250, -1));

        jPwd_Contrasenna.setBackground(new java.awt.Color(168, 205, 122));
        jPwd_Contrasenna.setBorder(null);
        getContentPane().add(jPwd_Contrasenna, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 250, -1));

        jBConfirmar.setBackground(new java.awt.Color(255, 255, 255));
        jBConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/Botón Crear Usuario.png"))); // NOI18N
        jBConfirmar.setBorder(null);
        jBConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(jBConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 150, 40));

        jTXT_CorreoElectronico.setBackground(new java.awt.Color(168, 205, 122));
        jTXT_CorreoElectronico.setBorder(null);
        getContentPane().add(jTXT_CorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 270, 30));

        jTXT_CrearUsuario.setBackground(new java.awt.Color(168, 205, 122));
        jTXT_CrearUsuario.setBorder(null);
        getContentPane().add(jTXT_CrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 270, 30));

        jLFondoCrearUsuario.setBackground(new java.awt.Color(168, 205, 122));
        jLFondoCrearUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/frm_CrearUsuario.png"))); // NOI18N
        getContentPane().add(jLFondoCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -7, 950, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmarActionPerformed
        DB_Usuarios db_Usuarios = new DB_Usuarios();

        Usuario nuevoUsuario = new Usuario();

        //Atributos
        String usuarioNuevo = jTXT_CrearUsuario.getText();
        String correoElectronico = jTXT_CorreoElectronico.getText();
        String contrasenna = new String(jPwd_Contrasenna.getPassword());
        String confirmarContrasenna = new String(jPwd_ConfirmarContrasenna.getPassword());
        //Ponerle información al usuario a pasar

        nuevoUsuario.setCedulaUsuario(confirmarContrasenna);
        nuevoUsuario.setNombreUsuario(usuarioNuevo);
        nuevoUsuario.setCorreo(correoElectronico);
        nuevoUsuario.setContrasenna(contrasenna);

        if (contrasenna.compareTo(confirmarContrasenna) == 0) {
            
            nuevoUsuario.setContrasenna(contrasenna);
            db_Usuarios.crearUsuario(nuevoUsuario);
            FRM_Entrada frm_Entrada = new FRM_Entrada();
            frm_Entrada.setVisible(true);
            JOptionPane.showMessageDialog(null, "Usuario creado exitosamente");
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Contraseñas no coinciden", "Error de creción de usuario ", JOptionPane.ERROR_MESSAGE);

        }


    }//GEN-LAST:event_jBConfirmarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        FRM_Entrada frm_Entrada = new FRM_Entrada();
        frm_Entrada.setVisible(true);
        frm_Entrada.toFront();
        this.dispose();
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConfirmar;
    private javax.swing.JLabel jLFondoCrearUsuario;
    private javax.swing.JPasswordField jPwd_ConfirmarContrasenna;
    private javax.swing.JPasswordField jPwd_Contrasenna;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTXT_CorreoElectronico;
    private javax.swing.JTextField jTXT_CrearUsuario;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
