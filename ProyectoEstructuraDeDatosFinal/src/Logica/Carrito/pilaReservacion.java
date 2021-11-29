package Logica.Carrito;

import javax.swing.JOptionPane;

public class pilaReservacion {

    /* ----------- Atributos ----------- */
    private nodoReservacion top;

    /* ----------- Métodos ----------- */
    //Creación de una reservación
    public void push(nodoReservacion elementoNuevo) {

        elementoNuevo.setAbajo(top);
        top = elementoNuevo;

    }

    //Elimina una reservación de la lista. 
    public nodoReservacion pop() {

        if (isEmpty()) {

            JOptionPane.showMessageDialog(null, "El proceso ha sido completado");
            return top; 
            
        } else {

            nodoReservacion aux = top;
            top = top.getAbajo();

            aux.setAbajo(null);
            return aux;

        }

    }

    //Valida si la pila esta vacía. 
    public boolean isEmpty() {

        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

}
