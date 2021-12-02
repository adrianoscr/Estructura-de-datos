package Logica;

import Logica.Carrito.Reservacion;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class DB_Reservaciones {

    public Connection connectionR;

    public DB_Reservaciones() {

        // Registrar el driver de Mariadb/MySQL.
        try {
            Class.forName("org.mariadb.jdbc.Driver").getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
        }
    }

    private void desconectarDB() {

        try {
            this.connectionR.commit();
            this.connectionR.close();
        } catch (SQLException ex) {
            Logger.getLogger(DB_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void conectarDB() {
        // Abrir la conexión.
        try {
            connectionR = (Connection) DriverManager.getConnection("jdbc:mariadb://139.177.205.149:3306/TURISMO", "proyectoclienteservidor", "centro1");
        } catch (SQLException ex) {
        }
    }

    public void crearReservacion(colaReservacionesAnteriores reservacion) {

        this.conectarDB();

        Reservacion miReservacion = reservacion.atiende().getMiReservacion();

        int contadorUsuario = 0;
        int contadorReserva = 0;
        
        while (miReservacion != null) {
            // Preparar la instrucción SQL.
            String miInsertar = "INSERT INTO Reservaciones (DuennoReservacion, CantidadPersonas, FechaHora, CostoPersona, CostoTotal, CostoIVA, id_Usuario, id_Reseva) VALUE(\""
                    + miReservacion.getNombreReservacion() + "\", \""
                    + miReservacion.getCantidadPersonas() + "\", \""
                    + miReservacion.getFechaHora() + "\", \""
                    + miReservacion.getCostoPersona() + "\", \""
                    + miReservacion.getCostoTotal() + "\", \""
                    + miReservacion.getCostoImpuestos() + "\", \""
                    + contadorUsuario++ + "\", \""
                    + contadorReserva++ + "\");";

            // Mandar a ejecutar la instrucción al servidor.
            try {
                PreparedStatement pstmt = this.connectionR.prepareStatement(miInsertar);

                pstmt.execute();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de base de datos, el id del usuario o el id de la reserva ya existen en el sistema");

            }
            //leer el siguiente
            miReservacion = reservacion.atiende().getMiReservacion();
        }

        this.desconectarDB();
    }

}
