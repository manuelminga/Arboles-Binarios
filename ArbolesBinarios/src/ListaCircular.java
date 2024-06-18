public class ListaCircular extends ListaEnlazada {
    public int conteoEnlaceDerecho;
    public int conteoEnlaceIzquierdo;
    public int conteoEnlaceArriba;
    public int conteoEnlaceAbajo;

    @Override
    public int identificarCuantoNodo() {
        int contador = 0;
        Nodo actual = cabeza;
        if (actual != null) {
            do {
                contador++;
                actual = actual.getSiguiente();
            } while (actual != cabeza);
        }
        return contador;
    }

    public void recorrerEnlace() {
        // Implementar la lógica de recorrido de la lista circular
    }
}
