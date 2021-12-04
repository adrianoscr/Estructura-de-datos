package Logica;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB_Usuarios {
<<<<<<< Updated upstream
=======
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
>>>>>>> Stashed changes

    public Connection connection;

    public DB_Usuarios() {

        // Registrar el driver de Mariadb/MySQL.
        try {
            Class.forName("org.mariadb.jdbc.Driver").getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
        }
    }

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
            connection = (Connection) DriverManager.getConnection("jdbc:mariadb://139.177.205.149:3306/TURISMO", "proyectoclienteservidor", "centro1");
        } catch (SQLException ex) {
        }
    }

    public void crearUsuario(Usuario usuario) {

        this.conectarDB();
        // Preparar la instrucción SQL.
        String miInsertar = "INSERT INTO Usuarios (CedulaUsuario, NombreUsuario, Correo, Contrasenna) VALUE(\""
                + usuario.getCedulaUsuario() + "\", \""
                + usuario.getNombreUsuario() + "\", \""
                + usuario.getCorreo() + "\", \""
                + usuario.getContrasenna() + "\");";
        
        // Mandar a ejecutar la instrucción al servidor.

        try {
            PreparedStatement pstmt = this.connection.prepareStatement(miInsertar);

            pstmt.execute();

        } catch (SQLException ex) {
            System.out.println("Verifique que su cédula y correo electrónico sean únicos.");

        }

        this.desconectarDB();
    }
    
    
    public VerificarUsuario verificarUsuario(String usuario, String password) {
        //variables

        this.conectarDB();

        //Leer usuario ingresado y buscar uno igual.
        String consultar = "SELECT * FROM `Usuarios`  where NombreUsuario = \"" + usuario + "\" and Contrasenna = \"" + password + "\"; ";

        // Mandar a ejecutar la instrucción al servidor.
        try {
            PreparedStatement pstmt = this.connection.prepareStatement(consultar);

            ResultSet rs = pstmt.executeQuery(consultar);

            if (rs.next() == true) {
                VerificarUsuario datosUsuario = new VerificarUsuario(rs.getString("NombreUsuario"), rs.getString("Contrasenna"));
                 this.desconectarDB();
                 return datosUsuario;
                 
            } else {
                 this.desconectarDB();
                return null;
            }

        } catch (SQLException ex) {
            System.out.println("Error al consultar el usuario.");

        }

       return null;

    }

<<<<<<< Updated upstream
=======
            ResultSet rs = pstmt.executeQuery(consultar);

            if (rs.next() == true) {
                 provincia = rs.getString("provincia");
            } else {
                 System.out.println("error al consultar la provincia");
            }
        } catch (SQLException ex) {
            System.out.println("Error al consultar el usuario.");

        }
        this.desconectarDB();
        
        return provincia;
    }
    
    
   
>>>>>>> Stashed changes
}
