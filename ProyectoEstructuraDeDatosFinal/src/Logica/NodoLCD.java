package Logica;

public class NodoLCD {

    private DatosAtracciones dato;
    private NodoLCD siguiente;
    private NodoLCD anterior;

    public NodoLCD(DatosAtracciones dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;

    }

    public DatosAtracciones getDato() {
        return dato;
    }

    public void setDato(DatosAtracciones dato) {
        this.dato = dato;
    }

    public NodoLCD getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLCD siguiente) {
        this.siguiente = siguiente;
    }

    public NodoLCD getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoLCD anterior) {
        this.anterior = anterior;
    }

}
