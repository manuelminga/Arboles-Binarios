public class ListaDoblementeCircular {
    private NodoDoble primerNodo;
    private NodoDoble ultimoNodo;

    public NodoDoble buscarDato(int dato) {
        NodoDoble actual = primerNodo;
        if (actual == null) return null;

        do {
            if (actual.getDato() == dato) {
                return actual;
            }
            actual = actual.getSiguienteNodo();
        } while (actual != primerNodo);

        return null;
    }

    // Otros métodos para agregar, eliminar, etc.
}
