package Logica;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDatosGeneral {

    protected Connection connection;

    public BaseDatosGeneral() {
        // Registrar el driver de Mariadb/MySQL.
        try {
            Class.forName("org.mariadb.jdbc.Driver").getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
        }
    }

    protected void desconectarDB() {

        try {
            this.connection.commit();
            this.connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DB_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    protected void conectarDB() {
        // Abrir la conexión.
        try {
            connection = (Connection) DriverManager.getConnection("jdbc:mariadb://139.177.205.149:3306/TURISMO", "proyectoclienteservidor", "centro1");
        } catch (SQLException ex) {
        }
    }
}
