package Logica;

import Logica.Carrito.Reservacion;
import java.lang.reflect.InvocationTargetException;

import java.sql.SQLException;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class DB_Reservaciones extends BaseDatosGeneral {

    public DB_Reservaciones() {
        super();
    }

    public void crearReservacion(colaReservacionesAnteriores reservacion) {

        this.conectarDB();

        Reservacion miReservacion = reservacion.atiende().getMiReservacion();

        while (miReservacion != null) {
            // Preparar la instrucción SQL.
            String miInsertar = "INSERT INTO Reservaciones (DuennoReservacion, CantidadPersonas, FechaHora, CostoPersona, CostoTotal, CostoIVA, id_Usuario, id_Reseva) VALUE(\""
                    + miReservacion.getNombreReservacion() + "\", \""
                    + miReservacion.getCantidadPersonas() + "\", \""
                    + miReservacion.getFechaHora() + "\", \""
                    + miReservacion.getCostoPersona() + "\", \""
                    + miReservacion.getCostoTotal() + "\", \""
                    + miReservacion.getCostoImpuestos() + "\", \""
                    + miReservacion.getId_Usuario() + "\", \""
                    + miReservacion.getId_Reserva() + "\");";

            // Mandar a ejecutar la instrucción al servidor.
            try {
                PreparedStatement pstmt = this.connection.prepareStatement(miInsertar);

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
