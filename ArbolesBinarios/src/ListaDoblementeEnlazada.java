public class ListaDoblementeEnlazada {
    private NodoDoble cabeza;
    private NodoDoble cola;

    public void recorrerEnlace() {
        NodoDoble actual = cabeza;
        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getSiguienteNodo();
        }
    }

    //  métodos para agregar, eliminar, .
}
