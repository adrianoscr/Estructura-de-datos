package Logica;

import Logica.Carrito.Reservacion;
import java.lang.reflect.InvocationTargetException;

import java.sql.SQLException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DB_Reservaciones extends BaseDatosGeneral {

    public DB_Reservaciones() {
        super();
    }

    public void crearReservacion(colaReservacionesAnteriores reservacion) {

        this.conectarDB();

        if (reservacion != null) {
            nodoColaAnteriores miNodo = reservacion.atiende();

            while (miNodo != null) {
                //PREPARANDO DATOS PARA GUARDARLOS.
                try {
                    Reservacion miReservacion = miNodo.getMiReservacion();
                    // Preparar la instrucción SQL.
                    String miInsertar = "INSERT INTO Reservaciones (DuennoReservacion, CantidadPersonas, FechaHora, CostoPersona, CostoTotal, CostoIVA) VALUE(\""
                            + miReservacion.getNombreReservacion() + "\", \""
                            + miReservacion.getCantidadPersonas() + "\", \""
                            + miReservacion.getFechaHora() + "\", \""
                            + miReservacion.getCostoPersona() + "\", \""
                            + miReservacion.getCostoTotal() + "\", \""
                            + miReservacion.getCostoImpuestos() + "\");";

                    // Mandar a ejecutar la instrucción al servidor.
                    try {
                        PreparedStatement pstmt = this.connection.prepareStatement(miInsertar);

                        pstmt.execute();

                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error de base de datos, el id del usuario o el id de la reserva ya existen en el sistema");
                    }
                } catch (Exception e) {
                    System.out.print("Pila vacía");
                }
                miNodo = reservacion.atiende();
            }
        }

        this.desconectarDB();
    }

    public ArrayList<Reservacion> extraerDatosAtracciones() {

        ArrayList<Reservacion> listaReservaciones = new ArrayList<>();

        this.conectarDB();

        //Leer atraccion ingresada.
        String consultar = "SELECT * FROM `Reservaciones`; ";

        // Mandar a ejecutar la instrucción al servidor.
        try {
            PreparedStatement pstmt = this.connection.prepareStatement(consultar);

            ResultSet rs = pstmt.executeQuery(consultar);

            while (rs.next() == true) {
                Reservacion datoReservacion = new Reservacion(rs.getString("DuennoReservacion"), rs.getInt("CantidadPersonas"), rs.getString("FechaHora"), rs.getFloat("CostoPersona"), rs.getFloat("CostoTotal"), rs.getFloat("CostoIVA"));
                listaReservaciones.add(datoReservacion);
            }

            this.desconectarDB();
            return listaReservaciones;

        } catch (SQLException ex) {
            System.out.println("Error al consultar las reservaciones.");

        }

        return null;
    }

}
