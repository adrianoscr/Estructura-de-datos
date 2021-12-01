
package semana11_estructuradatos_arboles;


public class NodoA {
    private int id; //Información concreta para el árbol
    private NodoA hijoIzq; //Referencia al sub-arbol izquierdo
    private NodoA hijoDer; //Referencia al sub-arbul derecho

    public NodoA(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NodoA getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(NodoA hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NodoA getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(NodoA hijoDer) {
        this.hijoDer = hijoDer;
    }
    
    
}
