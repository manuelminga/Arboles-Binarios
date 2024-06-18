public class ListaDoblementeEnlazada {
    protected int conteoEnlaceDerecho;
    protected int conteoEnlaceIzquierdo;
    protected Nodo cola;
    private ListaCircular listaCircular;

    public ListaDoblementeEnlazada(ListaCircular listaCircular) {
        this.listaCircular = listaCircular;
    }

    public void recorrerEnlace() {
        // Implementar la lógica de recorrido de la lista doblemente enlazada
    }

    public ListaCircular getListaCircular() {
        return listaCircular;
    }

    public void setListaCircular(ListaCircular listaCircular) {
        this.listaCircular = listaCircular;
    }
}
