
package Logica;


public class VerificarUsuario {
    private String nombreUsuario;
    private String contrasenna;

    public VerificarUsuario(String nombreUsuario, String contrasenna) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenna = contrasenna;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    
}
