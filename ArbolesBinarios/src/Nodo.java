public abstract class Nodo {
    public int dato;
    public Nodo izquierda;
    public Nodo derecha;
    private Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.izquierda = null;
        this.derecha = null;
    }

    public int getDato() {
        return dato;
    }

    public boolean esHoja() {
        // Retorna true si el nodo es una hoja (no tiene hijos)
        return this.izquierda == null && this.derecha == null;
    }

    // Getters y Setters para los atributos izquierda y derecha
    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return null;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

}
