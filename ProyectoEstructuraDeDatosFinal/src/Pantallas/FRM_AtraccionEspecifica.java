package Pantallas;

import Logica.DB_Atracciones;

import Logica.DatosAtracciones;
import Logica.ListaCD;
import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author silvi
 */
public class FRM_AtraccionEspecifica extends javax.swing.JFrame {

    String provincia;
    int id;
    String descripcion;

    public FRM_AtraccionEspecifica(String provincias, String descripcion) {
        initComponents();

        provincia = provincias;
        this.descripcion = descripcion;

        DB_Atracciones db_Atracciones = new DB_Atracciones();

        DatosAtracciones datosAtracciones = db_Atracciones.detalleAtraccion(descripcion);
        
        jLDetalleAtraccion.setText("<html>" + datosAtracciones.getDetalleAtraccion() + "</html>");
        jLnombreAtraccionSeleccionada.setText("<html><h1 style='color: #ffffff'>Atracción " + datosAtracciones.getAtraccion()+ "</h1></html>");

        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/Contents/" + datosAtracciones.getImagen() + ""));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(jLImagenAtraccion.getWidth(),
                jLImagenAtraccion.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        jLImagenAtraccion.setIcon(iconoEscalado);

        String a = datosAtracciones.getAmenidades();
        String[] array = a.split(",");

        jLamenidad1.setText("<html><div>" + array[0] + "</div></html>");
        jLamenidad2.setText("<html><div>" + array[1] + "</div></html>");
        jLamenidad3.setText("<html><div>" + array[2] + "</div></html>");

        jLamenidad1.setHorizontalAlignment(SwingConstants.CENTER);
        jLamenidad2.setHorizontalAlignment(SwingConstants.CENTER);
        jLamenidad3.setHorizontalAlignment(SwingConstants.CENTER);
    }

    public FRM_AtraccionEspecifica() {

        initComponents();
        DB_Atracciones atraccion = new DB_Atracciones();

        DatosAtracciones ret = atraccion.detalleAtraccion(descripcion);
        jLDetalleAtraccion.setText("<html>" + ret.getDetalleAtraccion() + "<html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLtitulocaracteristica = new javax.swing.JLabel();
        jLamenidad1 = new javax.swing.JLabel();
        jLamenidad2 = new javax.swing.JLabel();
        jLamenidad3 = new javax.swing.JLabel();
        jLDetalleAtraccion = new javax.swing.JLabel();
        jbtnAtras = new javax.swing.JButton();
        jbtnReservar = new javax.swing.JButton();
        jLnombreAtraccionSeleccionada = new javax.swing.JLabel();
        jLImagenAtraccion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLtitulocaracteristica.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLtitulocaracteristica.setText("Características:");
        getContentPane().add(jLtitulocaracteristica, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

        jLamenidad1.setBackground(new java.awt.Color(51, 102, 255));
        jLamenidad1.setForeground(new java.awt.Color(51, 0, 51));
        jLamenidad1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 51), 3));
        jLamenidad1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLamenidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 150, 40));

        jLamenidad2.setBackground(new java.awt.Color(51, 51, 255));
        jLamenidad2.setForeground(new java.awt.Color(51, 0, 51));
        jLamenidad2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 51), 3));
        getContentPane().add(jLamenidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 160, 40));

        jLamenidad3.setBackground(new java.awt.Color(51, 51, 255));
        jLamenidad3.setForeground(new java.awt.Color(51, 0, 51));
        jLamenidad3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 51), 3));
        getContentPane().add(jLamenidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, 150, 40));

        jLDetalleAtraccion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLDetalleAtraccion.setAutoscrolls(true);
        jLDetalleAtraccion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLDetalleAtraccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 600, 250));

        jbtnAtras.setText("Atrás");
        jbtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 100, 40));

        jbtnReservar.setText("Reservar");
        jbtnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReservarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, 110, 40));

        jLnombreAtraccionSeleccionada.setToolTipText("");
        getContentPane().add(jLnombreAtraccionSeleccionada, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 720, 50));

        jLImagenAtraccion.setToolTipText("");
        getContentPane().add(jLImagenAtraccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 230, 420));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/frm_AtraccionesProvincia.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReservarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnReservarActionPerformed

    private void jbtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAtrasActionPerformed
        this.dispose();
        FRM_AtraccionesProvincia detalleAtraccion = new FRM_AtraccionesProvincia(provincia);
        detalleAtraccion.setVisible(true);
        detalleAtraccion.setLocationRelativeTo(null);


    }//GEN-LAST:event_jbtnAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLDetalleAtraccion;
    private javax.swing.JLabel jLImagenAtraccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLamenidad1;
    private javax.swing.JLabel jLamenidad2;
    private javax.swing.JLabel jLamenidad3;
    private javax.swing.JLabel jLnombreAtraccionSeleccionada;
    private javax.swing.JLabel jLtitulocaracteristica;
    private javax.swing.JButton jbtnAtras;
    private javax.swing.JButton jbtnReservar;
    // End of variables declaration//GEN-END:variables
}
