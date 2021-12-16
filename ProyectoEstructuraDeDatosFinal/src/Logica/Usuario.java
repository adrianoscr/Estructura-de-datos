
package Logica;


public class Usuario {
    private String cedulaUsuario;
    private String NombreUsuario;
    private String Correo;
    private String contrasenna;

    public Usuario() {
    }

       
    
    public Usuario(String cedulaUsuario, String NombreUsuario, String Correo, String contrasenna) {
        this.cedulaUsuario = cedulaUsuario;
        this.NombreUsuario = NombreUsuario;
        this.Correo = Correo;
        this.contrasenna = contrasenna;
    }
    
    public Usuario(String NombreUsuario, String contrasenna) {
        this.NombreUsuario = NombreUsuario;
        this.contrasenna = contrasenna;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public String getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(String cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    
}


