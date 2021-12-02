package Logica;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
    
     public void crearReservacion(nodoColaAnteriores reservacion) {

        this.conectarDB();
//        // Preparar la instrucción SQL.
//        String miInsertar = "INSERT INTO Usuarios (CedulaUsuario, NombreUsuario, Correo, Contrasenna) VALUE(\""
//                + usuario.getCedulaUsuario() + "\", \""
//                + usuario.getNombreUsuario() + "\", \""
//                + usuario.getCorreo() + "\", \""
//                + usuario.getContrasenna() + "\");";
//        
//        // Mandar a ejecutar la instrucción al servidor.
//
//        try {
//            PreparedStatement pstmt = this.connectionR.prepareStatement(miInsertar);
//
//            pstmt.execute();
//
//        } catch (SQLException ex) {
//            System.out.println("Verifique que su cédula y correo electrónico sean únicos.");
//
//        }

        this.desconectarDB();
    }
    
    
    
}
