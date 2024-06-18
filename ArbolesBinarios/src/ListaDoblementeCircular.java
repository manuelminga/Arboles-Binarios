public class ListaDoblementeCircular {
    public NodoDoble primerNodo;
    public NodoDoble ultimoNodo;

    public NodoDoble buscarDato(int dato) {
        NodoDoble actual = primerNodo;
        while (actual != null && actual.dato != dato) {
            actual = actual.siguienteNodo;
        }
        return actual;
    }
}