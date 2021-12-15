package Logica;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB_Atracciones extends BaseDatosGeneral {

    // variables para cambio de información dinámica en el FRM_AtraccionesProvincia
    public String nombre_provincia;
    public String info_provincia;
    public String img;
    public int id;

    public DB_Atracciones() {
        super();
    }

    public ListaCD extraerDatosAtracciones() {

        ListaCD listaAtracciones = new ListaCD();

        this.conectarDB();

        //Leer atraccion ingresada.
        String consultar = "SELECT * FROM `atracciones`; ";

        // Mandar a ejecutar la instrucción al servidor.
        try {
            PreparedStatement pstmt = this.connection.prepareStatement(consultar);

            ResultSet rs = pstmt.executeQuery(consultar);

            while (rs.next() == true) {
                DatosAtracciones datosAtraccion = new DatosAtracciones(rs.getString("provincia"), rs.getDouble("Precio"), rs.getString("nombreAtraccion"), rs.getInt("id"), rs.getString("detalleAtraccion"));
                listaAtracciones.insetar(datosAtraccion);
            }

            this.desconectarDB();
            return listaAtracciones;

        } catch (SQLException ex) {
            System.out.println("Error al consultar la atraccion.");

        }

        return null;
    }

    public DatosAtracciones detalleAtraccion(String id) {
        
        //Se declara la varible como null para uso posterior
        DatosAtracciones datosAtracciones = null;
        
       
        String stmt = "SELECT * FROM `galeria` WHERE `nombreAtraccion` = '" + id + "'";

        this.conectarDB();
            
        try {
            PreparedStatement pstmt = this.connection.prepareStatement(stmt);

            ResultSet rs = pstmt.executeQuery(stmt);

            while (rs.next() == true) {
                //Se le pasa la información al constructor de DatosAtracciones
                datosAtracciones = new DatosAtracciones(
                        rs.getString("provincia"),
                        rs.getDouble("Precio"),
                        rs.getString("nombreAtraccion"),
                        rs.getInt("id"),
                        rs.getString("detalleAtraccion"),
                        rs.getString("imagen"),
                        rs.getString("amenidades"));

            }
            this.desconectarDB();
            return datosAtracciones;

        } catch (SQLException ex) {
            System.out.println("Error al consultar las atracciones." + ex.getMessage());

        }

        return null;
    }

}
