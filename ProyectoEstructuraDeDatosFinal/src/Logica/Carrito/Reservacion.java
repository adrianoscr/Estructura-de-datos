package Logica.Carrito;

public class Reservacion {

    /* ----------- Atributos ----------- */
    private String nombreReservacion;
    private int cantidadPersonas;
    private String fechaHora;
    private Float costoPersona;
    private Float costoTotal;
    private Float costoImpuestos;

    /* ----------- Constructores ----------- */
    public Reservacion(String nombreReservacion, int cantidadPersonas, String fechaHora, Float costoPersona, Float costoTotal, Float costoImpuestos) {
        this.nombreReservacion = nombreReservacion;
        this.cantidadPersonas = cantidadPersonas;
        this.fechaHora = fechaHora;
        this.costoPersona = costoPersona;
        this.costoTotal = costoTotal;
        this.costoImpuestos = costoImpuestos;
    }

    public Reservacion() {
    }

    /* ----------- Getters & Setters ----------- */
    public String getNombreReservacion() {
        return nombreReservacion;
    }

    public void setNombreReservacion(String nombreReservacion) {
        this.nombreReservacion = nombreReservacion;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Float getCostoPersona() {
        return costoPersona;
    }

    public void setCostoPersona(Float costoPersona) {
        this.costoPersona = costoPersona;
    }

    public Float getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Float costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Float getCostoImpuestos() {
        return costoImpuestos;
    }

    public void setCostoImpuestos(Float costoImpuestos) {
        this.costoImpuestos = costoImpuestos;
    }

}
