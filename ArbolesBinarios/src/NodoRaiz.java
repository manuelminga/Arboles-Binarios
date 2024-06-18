public class NodoRaiz extends Nodo {
    private Nodo nodoPadre;

    public NodoRaiz(int dato) {
        super(dato);
        this.nodoPadre = null; // La raíz no tiene padre
    }

    public Nodo getNodoPadre() {
        return nodoPadre;
    }
}
