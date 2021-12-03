package Logica.Carrito;

public class nodoReservacion {

    /* ----------- Atributos ----------- */
    private Reservacion miReservacion;
    private nodoReservacion abajo;

    /* ----------- Constructor ----------- */
    public nodoReservacion(Reservacion miReservacion) {
        this.miReservacion = miReservacion;
    }

    /* ----------- Getters & Setters ----------- */
    public Reservacion getMiReservacion() {
        return miReservacion;
    }

    public void setMiReservacion(Reservacion miReservacion) {
        this.miReservacion = miReservacion;
    }

    public nodoReservacion getAbajo() {
        return abajo;
    }

    public void setAbajo(nodoReservacion abajo) {
        this.abajo = abajo;
    }

}
