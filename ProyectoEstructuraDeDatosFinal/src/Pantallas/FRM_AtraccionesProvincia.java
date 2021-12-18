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
                jLDescripcionProvicia.setText("<html> Cartago-- Cartago es la ciudad cabecera y centro administrativo contemporáneo del Cantón de "
                        + "Cartago, en la Provincia de Cartago de Costa Rica. Se compone de los distritos Oriental y Occidental del cantón."
                        + "<br><br> Históricamente fue la primera ciudad capital de Costa Rica, durante el periodo colonial, desde 1563 hasta 1824, "
                        + "al ser la residencia de los gobernadores españoles desde su fundación, hasta la independencia de las provincias centroamericanas "
                        + "en 1821. </html>");

                break;

            case "San José":
                jLImagenProvincia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/San Jose.png")));
                jLDescripcionProvicia.setText("<html> San José-- San José es la capital de la República de Costa Rica y "
                        + "la cabecera de la provincia homónima. Ubicada en el centro del país, específicamente sobre la "
                        + "meseta intervolcánica llamada Valle Central, y contenida en su totalidad por el cantón homónimo."
                        + "<br><br> Culturalmente puede considerarse casi en su totalidad con influencia europea que le confirieron "
                        + "la inmigración (en especial española e italiana) y el acoplamiento de tendencias nacidas en Francia y "
                        + "Bélgica desde finales del siglo XIX. </html>");
                break;

            case "Alajuela":
                jLImagenProvincia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/Alajuela.png")));
                jLDescripcionProvicia.setText("<html> Alajuela-- Alajuela es la provincia número 2 de Costa Rica, localizada en la parte septentrional del país."
                        + "<br><br> Posee una superficie de 9753 km², lo que la convierte en la tercera más extensa de Costa Rica por detrás de Guanacaste "
                        + "y por delante de la Provincia de Limón.\n" 
                        +"Dos importantes cimas volcánicas del país, el volcán Poás y el volcán Arenal, se encuentran en su territorio. "
                        + "La provincia cuenta con cuatro parques nacionales y una reserva indígena en Guatuso, habitada por la etnia maléku. </html>");
                break;
                
            case "Puntarenas":
                jLImagenProvincia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/Puntarenas.png")));
                jLDescripcionProvicia.setText("<html> Puntarenas-- Puntarenas es una ciudad de Costa Rica, y capital del cantón de Puntarenas y la provincia "
                        + "de Puntarenas, la más extensa del país. Es la ciudad más grande y poblada del Pacífico costarricense. "
                        + "<br><br> La ciudad de Puntarenas es rica en historia, tradiciones y costumbres. Históricamente, fue el puerto más importante del "
                        + "Pacífico costarricense, por el que se dieron las principales exportaciones que permitieron el desarrollo del país durante el siglo XIX y"
                        + " parte del siglo XX </html>");
                break;
                
            case "Heredia":
                jLImagenProvincia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/Heredia.png")));
                jLDescripcionProvicia.setText("<html> Heredia--  La ciudad surgió alrededor de una ayuda de parroquia a principios del siglo XVIII con el nombre de Cubujuquí."
                        + "<br><br> En 1763 se le dio la denominación oficial de villa de Heredia, pero el título de villa fue revocado en 1779. Se le conoció popularmente "
                        + "como Villa Vieja, pero esa práctica fue prohibida por las autoridades en 1801. Las Cortes españolas le concedieron nuevamente el título de "
                        + "villa en 1813. Se le conoce popularmente además como \"La Ciudad de las Flores\". </html>");
                break;
                
            case "Limón":
                jLImagenProvincia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/Limon.png")));
                jLDescripcionProvicia.setText("<html> Limón-- Limón es el primer distrito y ciudad cabecera del cantón de Limón, en la provincia de Limón, de Costa Rica.2​"
                        + "<br><br> Sus dos puertos son los más grandes e importantes para usos comerciales de este país centroamericano, en donde las exportaciones "
                        + "e importaciones sobrepasan el 80% de la actividad nacional. </html>");
                break;
            case "Guanacaste":
                jLImagenProvincia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/Guanacaste.png")));
                jLDescripcionProvicia.setText("<html> Guanacaste-- Guanacaste es la provincia número 5 de Costa Rica, localizada en el extremo noroeste del país."
                        + "<br><br> Por su extensión es la segunda provincia más grande del país, pero también la más despoblada, en la cual habitan 326 953 personas.\n" 
                        +"El territorio de Guanacaste comprende la mayor parte del antiguo Partido de Nicoya, el cual se anexó al país el 25 de julio de 1824. Su relieve "
                        + "combina las cimas volcánicas de la cordillera de Guanacaste con amplias llanuras que se abren hacia el Pacífico. </html>");
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

        jLabel2 = new javax.swing.JLabel();
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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contents/Logo.png"))); // NOI18N
        jLabel2.setRequestFocusEnabled(false);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 80, 90));

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
        FRM_AtraccionesCR atraccionesCR = new FRM_AtraccionesCR(miPila, nuevoUsuario);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAtraciones;
    // End of variables declaration//GEN-END:variables

}
