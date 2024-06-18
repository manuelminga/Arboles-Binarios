public class ListaDoblementeCircular {
    private NodoDoble primerNodo;
    private NodoDoble ultimoNodo;

    public NodoDoble buscarDato(int dato) {
        NodoDoble actual = primerNodo;
        while (actual != null && actual.getDato() != dato) {
            actual = actual.getSiguienteNodo();
            if (actual == primerNodo) {
                return null; // El dato no está en la lista
            }
        }
        return actual;
    }
}
