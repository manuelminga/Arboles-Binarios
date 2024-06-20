public class ArbolAVL extends Arbol {
    private static class NodoAVL extends Nodo {
        NodoAVL(int valor) {
            super(valor);
        }

        NodoAVL izquierda;
        NodoAVL derecha;
    }

    public ArbolAVL() {
        this.setRaiz(null);
    }

    @Override
    public void recorrerEnOrden() {
        recorrerEnOrden(this.getRaiz());
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
        recorrerPreOrden(this.getRaiz());
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
        recorrerPostOrden(this.getRaiz());
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

    // Métodos de balanceo, rotación, etc. se implementarán aquí
}
