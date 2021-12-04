
package Logica;

public class ListaCD {
    
    NodoLCD cabeza;
    NodoLCD ultimo;
    
    public void agregar(DatosAtracciones d){
        if(cabeza==null){
            cabeza=new NodoLCD(d);
            ultimo=cabeza;
            
            
        }else if(d.getId()<cabeza.getDato().getId()){
            NodoLCD aux= new NodoLCD(d);
            aux.setSiguiente(cabeza);
            cabeza=aux;
            ultimo.setSiguiente(cabeza);
        }else if(ultimo.getDato().getId()<=d.getId()){
            ultimo.setSiguiente(new NodoLCD(d));
            ultimo=ultimo.getSiguiente();
            
            
        }else{
            NodoLCD aux=cabeza;
            while(aux.getSiguiente().getDato().getId()<d.getId()){
                aux=aux.getSiguiente();
                
            }
            NodoLCD temp= new NodoLCD(d);
            temp.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(temp);
        
    }
        ultimo.setSiguiente(cabeza);
        
    }
        
  
}
