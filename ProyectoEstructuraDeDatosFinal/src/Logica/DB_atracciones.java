
package Logica;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DB_atracciones {
    
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
        // variables para cambio de información dinámica en el FRM_AtraccionesProvincia
    public String nombre_provincia;
    public String info_provincia;
    public String img;
    public int id;

    
    public Connection connection;
    
     private void desconectarDB() {

        try {
            this.connection.commit();
            this.connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DB_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void conectarDB() {
        // Abrir la conexión.
        try {
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/atracciones_turisticas", "root", "");
        } catch (SQLException ex) {
        }
    }
    
    
//     public DatosAtracciones datosAtracciones(String provincia){
//         
//        this.conectarDB();
//        
//         String verificarAtraccion = "SELECT * FROM `atracciones` WHERE `provincia` ="+provincia+"";
//
//        try {
//            PreparedStatement pstmt = this.connection.prepareStatement(verificarAtraccion);
//
//            ResultSet rs = pstmt.executeQuery(verificarAtraccion);
//
//            if (rs.next() == true) {
//                String atraccion = new DatosAtracciones(rs.getString("provincia"));
//                
//                 return atraccion;
//                 
//            }
//
//        } catch (SQLException ex) {
//            System.out.println("Error al consultar el usuario.");
//
//        }
//        this.desconectarDB();
//       return null;
//
//    }
    
    public ArrayList<DatosAtracciones> extrarDatosAtracciones() {

 

        ArrayList<DatosAtracciones> listaAtracciones = new ArrayList<>();

 

        this.conectarDB();

 

        //Leer paciente ingresado.
        String consultar = "SELECT * FROM `atracciones`; ";

 

        // Mandar a ejecutar la instrucción al servidor.
        try {
            PreparedStatement pstmt = this.connection.prepareStatement(consultar);

 

            ResultSet rs = pstmt.executeQuery(consultar);

 

            while (rs.next() == true) {
                DatosAtracciones datosAtraccion = new DatosAtracciones(rs.getString("provincia"),rs.getDouble("Precio"),rs.getString("nombreAtraccion"),rs.getInt("id"),
                rs.getString("detalleAtraccion"));
                listaAtracciones.add(datosAtraccion);
            }

 

            this.desconectarDB();
            return listaAtracciones;

 

        } catch (SQLException ex) {
            System.out.println("Error al consultar el Paciente.");
            
        }

 

        return null;
    }
     
     public void informacion_provincia(String dato){
        
        String stmt = "SELECT * FROM `provincias` where provincia = '"+dato+"'";
        
        this.conectarDB();
        
        try {
            statement = connection.createStatement();
            ResultSet rs = resultSet = statement.executeQuery(stmt);
            
            if (resultSet.next() == true) {
                
                this.nombre_provincia = rs.getString("provincia");
                this.info_provincia=rs.getString("info");
                this.img=rs.getString("img");
                this.id=Integer.parseInt(rs.getString("id"));
            } else {
                 System.out.println("Error al consultar la provincia");
            }
        } catch (SQLException ex) {
            System.out.println("Error en la consulta a la base de datos, por favor "
                    + "revise el try/catch del metodo informacion_provincia en la clase DB_Usuarios.");

        }
        this.desconectarDB();
    }
}
