/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author ExtremeTech
 */
public class FRM_AtraccionesProvincia extends javax.swing.JFrame {

    /**
     * Creates new form FRM_AtraccionesProvincia
     */
    public FRM_AtraccionesProvincia() {
        initComponents();
    }

    public FRM_AtraccionesProvincia(String provicia) {
        initComponents();
        jLProviciaSeleccionada.setText(provicia);
        ImageIcon icon = null;

        switch (provicia) {

            case "Cartago":
                jLImagenProvincia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/btn_Cartago.png")));

                break;

            case "San José":
                jLImagenProvincia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/btn_SanJose.png")));
                break;

            case "Alajuela":
                jLImagenProvincia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/btn_Alajuela.png")));
                break;
            case "Puntarenas":
                jLImagenProvincia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/btn_Puntarenas.png")));
                break;
            case "Heredia":
                jLImagenProvincia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/btn_Heredia.png")));
                break;
            case "Limón":
                jLImagenProvincia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/btn_Limon.png")));
                break;
            case "Guanacaste":
                jLImagenProvincia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/btn_Guanacaste.png")));
                break;

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLImagenProvincia = new javax.swing.JLabel();
        jLProviciaSeleccionada = new javax.swing.JLabel();
        jLAtraccionesProvicia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLImagenProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 70));

        jLProviciaSeleccionada.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLProviciaSeleccionada.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLProviciaSeleccionada, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 570, 40));

        jLAtraccionesProvicia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/frm_AtraccionesProvincia.png"))); // NOI18N
        getContentPane().add(jLAtraccionesProvicia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        FRM_AtraccionesCR frm_Atracciones = new FRM_AtraccionesCR();
        frm_Atracciones.setVisible(true);
        frm_Atracciones.toFront();
        
        this.dispose();
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLAtraccionesProvicia;
    private javax.swing.JLabel jLImagenProvincia;
    private javax.swing.JLabel jLProviciaSeleccionada;
    // End of variables declaration//GEN-END:variables
}
