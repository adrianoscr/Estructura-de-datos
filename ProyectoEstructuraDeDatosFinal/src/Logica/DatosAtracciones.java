
package Logica;

public class DatosAtracciones {
    
    private String provincia;
    private double precio;
    private String atraccion;
    private int id;
    private String detalleAtraccion;
    
    public DatosAtracciones(){
        this.provincia="";
        this.precio=0.0;
        this.atraccion="";
        this.id=0;
        this.detalleAtraccion="";
        
    }
    
    public DatosAtracciones(String provincia, double precio, String atraccion, int id, String detalleAtraccion){
        this.provincia=provincia;
        this.precio=precio;
        this.atraccion=atraccion;
        this.id=id;
        this.detalleAtraccion=detalleAtraccion;
        
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetalleAtraccion() {
        return detalleAtraccion;
    }

    public void setDetalleAtraccion(String detalleAtraccion) {
        this.detalleAtraccion = detalleAtraccion;
    }
    
    
    
    
}
