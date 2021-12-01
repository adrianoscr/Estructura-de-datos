
package Logica;

import Logica.Carrito.Reservacion;


public class nodoColaAnteriores {
    private nodoColaAnteriores atras;
    private Reservacion miReservacion;

    public nodoColaAnteriores(nodoColaAnteriores atras, Reservacion miReservacion) {
        this.atras = atras;
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
