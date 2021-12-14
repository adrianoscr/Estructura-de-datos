package Logica;

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ListaCD {

    private NodoLCD cabeza;
    private NodoLCD ultimo;

    public void insetar(DatosAtracciones p) {
        //Es el primero
        if (cabeza == null) {
            cabeza = new NodoLCD(p);
            ultimo = cabeza;
            ultimo.setSiguiente(cabeza);
            cabeza.setAnterior(ultimo);

        } else if (p.getPrecio() < cabeza.getDato().getPrecio()) {
            //A la izquierda.
            NodoLCD aux = new NodoLCD(p);
            aux.setSiguiente(cabeza);
            cabeza = aux;
            ultimo.setSiguiente(cabeza);
            cabeza.setAnterior(ultimo);
            cabeza.getSiguiente().setAnterior(cabeza);

        } else if (ultimo.getDato().getPrecio() <= p.getPrecio()) {
            //A la derecha
            NodoLCD aux = new NodoLCD(p);
            aux.setAnterior(ultimo);
            ultimo.setSiguiente(aux);
            ultimo = ultimo.getSiguiente();
            ultimo.setSiguiente(cabeza);
            cabeza.setAnterior(ultimo);

        } else { //Cuando ya hay elementos

            NodoLCD aux = cabeza;

            while (aux.getSiguiente().getDato().getPrecio() < p.getPrecio()) {
                aux = aux.getSiguiente();
            }

            NodoLCD temp = new NodoLCD(p);
            temp.setSiguiente(aux.getSiguiente());
            temp.setAnterior(aux);
            aux.setSiguiente(temp);
            temp.getSiguiente().setAnterior(temp);

        }
    }

    //AQUÍ HAY UN MÉTODO RECURSIVO.
    public DefaultTableModel consultar(NodoLCD aux, String provincia, DefaultTableModel tablaAtraciones) {

        if (aux == cabeza) {

            if (aux.getDato().getProvincia().equals(provincia)) {
                tablaAtraciones.addRow(new Object[]{aux.getDato().getAtraccion(),
                    NumberFormat.getCurrencyInstance(new Locale("es", "CR")).format(aux.getDato().getPrecio()),
                    aux.getDato().getId(),
                    aux.getDato().getDetalleAtraccion()});
            }

            return consultar(aux.getSiguiente(), provincia, tablaAtraciones);

        } else {

            while (cabeza != aux) {

                if (aux.getDato().getProvincia().equals(provincia)) {

                    tablaAtraciones.addRow(new Object[]{aux.getDato().getAtraccion(),
                        NumberFormat.getCurrencyInstance(new Locale("es", "CR")).format(aux.getDato().getPrecio()),
                        aux.getDato().getId(),
                        aux.getDato().getDetalleAtraccion()});

                }
                aux = aux.getSiguiente();
            }
            return tablaAtraciones;
        }

    }

    public NodoLCD getCabeza() {
        return cabeza;
    }

}
