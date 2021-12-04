package Logica;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DB_Atracciones {

    // variables para cambio de información dinámica en el FRM_AtraccionesProvincia
    public String nombre_provincia;
    public String info_provincia;
    public String img;
    public int id;

    public Connection connectionA;

    private void desconectarDB() {

        try {
            this.connectionA.commit();
            this.connectionA.close();
        } catch (SQLException ex) {
            Logger.getLogger(DB_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void conectarDB() {
        // Abrir la conexión.
        try {
            connectionA = (Connection) DriverManager.getConnection("jdbc:mariadb://139.177.205.149:3306/TURISMO", "proyectoclienteservidor", "centro1");
        } catch (SQLException ex) {
        }
    }

    public ArrayList<DatosAtracciones> extraerDatosAtracciones() {

        ArrayList<DatosAtracciones> listaAtracciones = new ArrayList<>();

        this.conectarDB();

        //Leer atraccion ingresada.
        String consultar = "SELECT * FROM `atracciones`; ";

        // Mandar a ejecutar la instrucción al servidor.
        try {
            PreparedStatement pstmt = this.connectionA.prepareStatement(consultar);

            ResultSet rs = pstmt.executeQuery(consultar);

            while (rs.next() == true) {
                DatosAtracciones datosAtraccion = new DatosAtracciones(rs.getString("provincia"),rs.getDouble("Precio"), rs.getString("nombreAtraccion"), rs.getInt("id"), rs.getString("detalleAtraccion"));
                listaAtracciones.add(datosAtraccion);
            }

            this.desconectarDB();
            return listaAtracciones;

        } catch (SQLException ex) {
            System.out.println("Error al consultar la atraccion.");

        }

        return null;
    }

}
