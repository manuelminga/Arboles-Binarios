public class NodoDoble extends Nodo {
    private NodoDoble siguienteNodo;
    private NodoDoble anteriorNodo;

    public NodoDoble(int dato) {
        super(dato);
        this.siguienteNodo = null;
        this.anteriorNodo = null;
    }

    public NodoDoble getSiguienteNodo() {
        return siguienteNodo;
    }

    public void setSiguienteNodo(NodoDoble siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }

    public NodoDoble getAnteriorNodo() {
        return anteriorNodo;
    }

    public void setAnteriorNodo(NodoDoble anteriorNodo) {
        this.anteriorNodo = anteriorNodo;
    }
}
