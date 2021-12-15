package Logica;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB_Usuarios extends BaseDatosGeneral {

 
    public DB_Usuarios(){
        super();
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

}
