public class ArbolAVL extends Arbol {
    private Nodo raiz;
    protected void rotacionIzquierda;
    protected void rotacionDerecha;
    private void balancearNodos;
    protected int altura;


    public ArbolAVL() {
        this.raiz = null;
    }

    public int medirAltura() {
        return altura(this.raiz);
    }

    private int altura(Nodo nodo) {
        return nodo == null ? -1 : Math.max(altura(nodo.izquierda), altura(nodo.derecha)) + 1;
    }

    private static class Nodo {
        int valor;
        Nodo izquierda;
        Nodo derecha;

        Nodo(int valor) {
            this.valor = valor;
            this.izquierda = null;
            this.derecha = null;
        }
    }
}
