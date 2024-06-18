public class ArbolAVL extends Arbol {
    protected void rotacionIzquierda() {
        // Implementación específica
    }

    protected void rotacionDerecha() {
        // Implementación específica
    }

    private void balancearNodos() {
        // Implementación específica
    }

    protected int altura;

    public ArbolAVL() {
        this.setRaiz(null);
    }

    public int medirAltura() {
        return altura(this.getRaiz());
    }

    private int altura(Nodo nodo) {
        return nodo == null ? -1 : Math.max(altura(nodo.getIzquierda()), altura(nodo.getDerecha())) + 1;
    }

    private static class NodoAVL extends Nodo {
        NodoAVL(int valor) {
            super(valor);
        }

        NodoAVL izquierda;
        NodoAVL derecha;
    }

    @Override
    public void recorrerEnOrden() {
        recorrerEnOrden(this.getRaiz());
    }

    private void recorrerEnOrden(Nodo nodo) {
        if (nodo != null) {
            recorrerEnOrden(nodo.getIzquierda());
            System.out.println(nodo.getDato());
            recorrerEnOrden(nodo.getDerecha());
        }
    }

    @Override
    public void recorrerPreOrden() {
        // Implementación específica para ArbolAVL
    }

    @Override
    public void recorrerPostOrden() {
        // Implementación específica para ArbolAVL
    }
}
