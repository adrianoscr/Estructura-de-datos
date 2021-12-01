
package Logica;

public class colaReservacionesAnteriores {
    private nodoColaAnteriores frente;
    private nodoColaAnteriores ultimo;

    public void enCola(nodoColaAnteriores elmentoNuevo) {
        if (frente == null) {
            frente = elmentoNuevo;
            ultimo = elmentoNuevo;

        } else {
            ultimo.setAtras(elmentoNuevo);
            ultimo = elmentoNuevo;
        }
    }

    public nodoColaAnteriores atiende() {
        //Guardamos el frente antes de perderlo.

        nodoColaAnteriores aux = frente;

        if (frente != null) {
            frente = frente.getAtras();
            //Le pasamos null para desligarlo.
            aux.setAtras(null);
            return aux;
        } else {
            return aux;
        }

    }

    public nodoColaAnteriores proximoAtender() {
        return frente;
    }

    public nodoColaAnteriores ultimoEnLlegar() {
        return ultimo;
    }
}
