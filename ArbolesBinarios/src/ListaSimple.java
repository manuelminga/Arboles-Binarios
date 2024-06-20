public class ListaSimple extends ListaEnlazada {
    @Override
    public int identificarCuantoNodo() {
        int contador = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }
        return contador;
    }
}
