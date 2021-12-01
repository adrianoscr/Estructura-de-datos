package semana11_estructuradatos_arboles;

public class Arbol {
    
    private NodoA raiz;
    
    public void inserta(int x) {
        if (raiz == null) {
            raiz = new NodoA(x);
        } else {
            insertarR(raiz, x);
        }
    }
    
    private void insertarR(NodoA n, int x) {
        if (x <= n.getId()) { //Si el valor se debe insertar a la izquierda.
            if (n.getHijoIzq() == null) { //preguntar si mi hijo izquierdo tiene algo.
                n.setHijoIzq(new NodoA(x)); //Si no tiene nada, agregar.
            } else {
                insertarR(n.getHijoIzq(), x); //De existir, bajar recursivamente.
            }
            
        } else {//Si el valor se debe insertar a la derecha
            if (n.getHijoDer() == null) { //preguntar si mi hijo derecho tiene algo.
                n.setHijoDer(new NodoA(x));
            } else {
                insertarR(n.getHijoDer(), x);
            }
        }
    }
    
}
