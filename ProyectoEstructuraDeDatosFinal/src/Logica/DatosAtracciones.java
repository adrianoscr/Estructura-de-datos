package Logica;

public class DatosAtracciones {
    //variables
    private String provincia;
    private double precio;
    private String atraccion;
    private int id;
    private String detalleAtraccion;
    private String imagen;
    private String amenidades;

    public DatosAtracciones() {
        this(null, 0.0, null, 0, null, "default.jpg", "");
    }

    //Constructor para detalleAtraccion
    public DatosAtracciones(String provincia, double precio, String atraccion, int id, String detalleAtraccion, String imagen, String amenidades) {
        this.provincia = provincia;
        this.precio = precio;
        this.atraccion = atraccion;
        this.id = id;
        this.detalleAtraccion = detalleAtraccion;
        this.imagen = imagen;
        this.amenidades = amenidades;
    }
    //Constructor para provincia
    public DatosAtracciones(String provincia, double precio, String atraccion, int id, String detalleAtraccion) {
        this.provincia = provincia;
        this.precio = precio;
        this.atraccion = atraccion;
        this.id = id;
        this.detalleAtraccion = detalleAtraccion;

    }
    
    //Getters y Setters de cada variable 

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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getAmenidades() {
        return amenidades;
    }

    public void setAmenidades(String amenidades) {
        this.amenidades = amenidades;
    }

}
