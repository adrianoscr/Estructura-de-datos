
package Logica;

public class ListaCD {
    
    NodoLCD cabeza;
    NodoLCD cola;
    
    public void insertar(DatosAtracciones d){
         if(cabeza == null){
            cabeza = new NodoLCD(d);
            cola = cabeza;
            cabeza.setSiguiente(cola);
            cola.setAnterior(cabeza);
        }else if(d.getId()< cabeza.getDato().getId()){
            NodoLCD aux = new NodoLCD(d);
            aux.setSiguiente(cabeza);
            cabeza = aux;
            cola.setSiguiente(cabeza);
            cabeza.setAnterior(cola);
            cola.setAnterior(aux);
        }else if(cola.getDato().getId() <= d.getId()){
            NodoLCD aux = new NodoLCD(d);
            aux.setAnterior(cola);
            cola.setSiguiente(aux);
            cola = cola.getSiguiente();
            cola.setSiguiente(cabeza);
            cabeza.setAnterior(cola);
        }else{
            NodoLCD aux = cabeza;
            while(aux.getSiguiente().getDato().getId() < d.getId()){
                aux = aux.getSiguiente();
            }
            NodoLCD temp = new NodoLCD(d);
            temp.setSiguiente(aux.getSiguiente());
            temp.setAnterior(aux);
            aux.setSiguiente(temp);
            temp.getSiguiente().setAnterior(temp);
        }
    }
  
}
