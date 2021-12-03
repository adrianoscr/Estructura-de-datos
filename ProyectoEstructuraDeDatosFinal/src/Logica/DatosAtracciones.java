
package Logica;

public class DatosAtracciones {
    
    private String provincia;
    private double precio;
    private String atraccion;
    
    public DatosAtracciones(){
        this.provincia="";
        this.precio=0.0;
        this.atraccion="";
        
    }
    
    public DatosAtracciones(String provincia, double precio, String atraccion){
        this.provincia=provincia;
        this.precio=precio;
        this.atraccion=atraccion;
        
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getAtraccion() {
        return atraccion;
    }

    public void setAtraccion(String atraccion) {
        this.atraccion = atraccion;
    }
    
    
}
