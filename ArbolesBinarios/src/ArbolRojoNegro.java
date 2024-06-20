public class ArbolRojoNegro extends Arbol {
    private void balanceoNodo() {
    }

    protected void rotacionDerecha() {
    }

    protected void rotacionIzquierda() {
    }

    protected void colorNodo() {
    }

    protected int altura;

    public void balancearArbol() {
    }

    public void medirNodo() {
    }

    @Override
    public void recorrerEnOrden() {
        recorrerEnOrden(this.raiz);
    }

    private void recorrerEnOrden(Nodo nodo) {
        if (nodo != null) {
            recorrerEnOrden(nodo.getIzquierda());
            System.out.print(nodo.getDato() + " ");
            recorrerEnOrden(nodo.getDerecha());
        }
    }

    @Override
    public void recorrerPreOrden() {
        recorrerPreOrden(this.raiz);
    }

    private void recorrerPreOrden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.getDato() + " ");
            recorrerPreOrden(nodo.getIzquierda());
            recorrerPreOrden(nodo.getDerecha());
        }
    }

    @Override
    public void recorrerPostOrden() {
        recorrerPostOrden(this.raiz);
    }

    private void recorrerPostOrden(Nodo nodo) {
        if (nodo != null) {
            recorrerPostOrden(nodo.getIzquierda());
            recorrerPostOrden(nodo.getDerecha());
            System.out.print(nodo.getDato() + " ");
        }
    }

    @Override
    public void agregarNodo(int dato) {
        Nodo nuevoNodo = new Nodo(dato) {};
        if (raiz == null) {
            raiz = nuevoNodo;
        } else {
            Nodo actual = raiz;
            Nodo padre;
            while (true) {
                padre = actual;
                if (dato < actual.getDato()) {
                    actual = actual.getIzquierda();
                    if (actual == null) {
                        padre.setIzquierda(nuevoNodo);
                        return;
                    }
                } else {
                    actual = actual.getDerecha();
                    if (actual == null) {
                        padre.setDerecha(nuevoNodo);
                        return;
                    }
                }
            }
        }
        // Aquí es para llamar a los métodos de balanceo y rotación
        // balanceoNodo();
    }
}
