package Pantallas;

import Logica.Carrito.pilaReservacion;
import Logica.DB_Atracciones;
import Logica.ListaCD;
import Logica.Usuario;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FRM_AtraccionesProvincia extends javax.swing.JFrame {

    private String provincia;
    private pilaReservacion miPila;
    private Usuario nuevoUsuario;

    public FRM_AtraccionesProvincia() {
        initComponents();

    }

    public FRM_AtraccionesProvincia(String provincia, pilaReservacion miPila, Usuario nuevoUsuario) {
        initComponents();

        this.miPila = miPila;
        this.provincia = provincia;
        this.nuevoUsuario = nuevoUsuario;

        ListaCD datosAtracciones = new ListaCD();

        jLProviciaSeleccionada.setText("Atracciones " + provincia);

        ImageIcon icon = null;

        switch (provincia) {

            case "Cartago":
                jLImagenProvincia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/Cartago.png")));
                jLDescripcionProvicia.setText("<html> Cartago era anteriormente la capital de Costa Rica"
                        + "<br><br> Actualmente acá se encuentra la basilica principal del país </html>");

                break;

            case "San José":
                jLImagenProvincia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/San Jose.png")));
                jLDescripcionProvicia.setText("<html> Cartago era anteriormente la capital de Costa Rica"
                        + "<br><br> Actualmente acá se encuentra la basilica principal del país </html>");
                break;

            case "Alajuela":
                jLImagenProvincia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/Alajuela.png")));
                jLDescripcionProvicia.setText("<html> Cartago era anteriormente la capital de Costa Rica"
                        + "<br><br> Actualmente acá se encuentra la basilica principal del país </html>");
                break;
            case "Puntarenas":
                jLImagenProvincia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/Puntarenas.png")));
                jLDescripcionProvicia.setText("<html> Cartago era anteriormente la capital de Costa Rica"
                        + "<br><br> Actualmente acá se encuentra la basilica principal del país </html>");
                break;
            case "Heredia":
                jLImagenProvincia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/Heredia.png")));
                jLDescripcionProvicia.setText("<html> Cartago era anteriormente la capital de Costa Rica"
                        + "<br><br> Actualmente acá se encuentra la basilica principal del país </html>");
                break;
            case "Limón":
                jLImagenProvincia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/Limon.png")));
                jLDescripcionProvicia.setText("<html> Cartago era anteriormente la capital de Costa Rica"
                        + "<br><br> Actualmente acá se encuentra la basilica principal del país </html>");
                break;
            case "Guanacaste":
                jLImagenProvincia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/Guanacaste.png")));
                jLDescripcionProvicia.setText("<html> Cartago era anteriormente la capital de Costa Rica"
                        + "<br><br> Actualmente acá se encuentra la basilica principal del país </html>");
                break;

        }

        DB_Atracciones db_atracciones = new DB_Atracciones();
        datosAtracciones = db_atracciones.extraerDatosAtracciones();

        mostrar_datos_en_tabla(datosAtracciones);

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
        tablaAtraciones = new javax.swing.JTable();
        btn_Home = new javax.swing.JButton();
        jLImagenProvincia = new javax.swing.JLabel();
        jLDescripcionProvicia = new javax.swing.JLabel();
        jLProviciaSeleccionada = new javax.swing.JLabel();
        jLAtraccionesProvicia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaAtraciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Atracción", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAtraciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAtracionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAtraciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 660, 500));

        btn_Home.setBackground(new java.awt.Color(107, 170, 28));
        btn_Home.setForeground(new java.awt.Color(107, 170, 28));
        btn_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/btn_home.png"))); // NOI18N
        btn_Home.setBorder(null);
        btn_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HomeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, -1, -1));
        getContentPane().add(jLImagenProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 220, 110));

        jLDescripcionProvicia.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLDescripcionProvicia.setForeground(new java.awt.Color(255, 255, 255));
        jLDescripcionProvicia.setText("Text");
        jLDescripcionProvicia.setToolTipText("");
        jLDescripcionProvicia.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLDescripcionProvicia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 240, 300));

        jLProviciaSeleccionada.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLProviciaSeleccionada.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLProviciaSeleccionada, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 570, 40));

        jLAtraccionesProvicia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/frm_AtraccionesProvincia.png"))); // NOI18N
        getContentPane().add(jLAtraccionesProvicia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void btn_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HomeActionPerformed

        this.dispose();
        FRM_AtraccionesCR atraccionesCR = new FRM_AtraccionesCR();
        atraccionesCR.setLocationRelativeTo(null);
        atraccionesCR.setVisible(true);

    }//GEN-LAST:event_btn_HomeActionPerformed

    private void tablaAtracionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAtracionesMouseClicked

        int index = tablaAtraciones.getSelectedRow();

        DefaultTableModel tablaAtracciones = (DefaultTableModel) tablaAtraciones.getModel();
        this.dispose();

        FRM_AtraccionEspecifica frm_AtraccionEspecifica = new FRM_AtraccionEspecifica(this.provincia, tablaAtracciones.getValueAt(index, 0).toString().trim(), miPila, nuevoUsuario);
        frm_AtraccionEspecifica.setLocationRelativeTo(null);
        frm_AtraccionEspecifica.setVisible(true);
    }//GEN-LAST:event_tablaAtracionesMouseClicked

    public void mostrar_datos_en_tabla(ListaCD datosAtraccion) {

        if (datosAtraccion != null) {

            DefaultTableModel tablaAtracciones = (DefaultTableModel) tablaAtraciones.getModel();

            tablaAtracciones = datosAtraccion.consultar(datosAtraccion.getCabeza(), provincia, tablaAtracciones);

        } else {
            JOptionPane.showMessageDialog(null, "No se encuentra en el sistema los datos");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Home;
    private javax.swing.JLabel jLAtraccionesProvicia;
    private javax.swing.JLabel jLDescripcionProvicia;
    private javax.swing.JLabel jLImagenProvincia;
    private javax.swing.JLabel jLProviciaSeleccionada;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAtraciones;
    // End of variables declaration//GEN-END:variables

}
