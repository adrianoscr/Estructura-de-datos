
package Logica;

import Logica.Carrito.Reservacion;


public class nodoColaAnteriores {
    private nodoColaAnteriores atras;
    private Reservacion miReservacion;

    public nodoColaAnteriores(Reservacion miReservacion) {

        this.miReservacion = miReservacion;
    }

    public nodoColaAnteriores getAtras() {
        return atras;
    }

    public void setAtras(nodoColaAnteriores atras) {
        this.atras = atras;
    }

    public Reservacion getMiReservacion() {
        return miReservacion;
    }

    public void setMiReservacion(Reservacion miReservacion) {
        this.miReservacion = miReservacion;
    }
    
    


}
