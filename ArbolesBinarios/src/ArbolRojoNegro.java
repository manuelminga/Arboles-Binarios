public class ArbolRojoNegro extends Arbol {
    private static final boolean ROJO = true;
    private static final boolean NEGRO = false;

    private static class NodoRojoNegro extends Nodo {
        boolean color;
        NodoRojoNegro izquierda;
        NodoRojoNegro derecha;

        NodoRojoNegro(int dato) {
            super(dato);
            this.color = ROJO;
        }
    }

    @Override
    public void recorrerEnOrden() {
        recorrerEnOrden((NodoRojoNegro) this.getRaiz());
    }

    private void recorrerEnOrden(NodoRojoNegro nodo) {
        if (nodo != null) {
            recorrerEnOrden(nodo.izquierda);
            System.out.print(nodo.getDato() + " ");
            recorrerEnOrden(nodo.derecha);
        }
    }

    @Override
    public void recorrerPreOrden() {
        recorrerPreOrden((NodoRojoNegro) this.getRaiz());
    }

    private void recorrerPreOrden(NodoRojoNegro nodo) {
        if (nodo != null) {
            System.out.print(nodo.getDato() + " ");
            recorrerPreOrden(nodo.izquierda);
            recorrerPreOrden(nodo.derecha);
        }
    }

    @Override
    public void recorrerPostOrden() {
        recorrerPostOrden((NodoRojoNegro) this.getRaiz());
    }

    private void recorrerPostOrden(NodoRojoNegro nodo) {
        if (nodo != null) {
            recorrerPostOrden(nodo.izquierda);
            recorrerPostOrden(nodo.derecha);
            System.out.print(nodo.getDato() + " ");
        }
    }

    @Override
    public void agregarNodo(int dato) {
        raiz = agregarNodo((NodoRojoNegro) raiz, dato);
        ((NodoRojoNegro) raiz).color = NEGRO;
    }

    private NodoRojoNegro agregarNodo(NodoRojoNegro nodo, int dato) {
        if (nodo == null) {
            return new NodoRojoNegro(dato);
        }

        if (dato < nodo.getDato()) {
            nodo.izquierda = agregarNodo(nodo.izquierda, dato);
        } else if (dato > nodo.getDato()) {
            nodo.derecha = agregarNodo(nodo.derecha, dato);
        } else {
            return nodo; // Los valores duplicados no están permitidos
        }

        if (esRojo(nodo.derecha) && !esRojo(nodo.izquierda)) {
            nodo = rotacionIzquierda(nodo);
        }
        if (esRojo(nodo.izquierda) && esRojo(nodo.izquierda.izquierda)) {
            nodo = rotacionDerecha(nodo);
        }
        if (esRojo(nodo.izquierda) && esRojo(nodo.derecha)) {
            cambiarColor(nodo);
        }

        return nodo;
    }

    private NodoRojoNegro rotacionIzquierda(NodoRojoNegro nodo) {
        NodoRojoNegro x = nodo.derecha;
        nodo.derecha = x.izquierda;
        x.izquierda = nodo;
        x.color = nodo.color;
        nodo.color = ROJO;
        return x;
    }

    private NodoRojoNegro rotacionDerecha(NodoRojoNegro nodo) {
        NodoRojoNegro x = nodo.izquierda;
        nodo.izquierda = x.derecha;
        x.derecha = nodo;
        x.color = nodo.color;
        nodo.color = ROJO;
        return x;
    }

    private void cambiarColor(NodoRojoNegro nodo) {
        nodo.color = ROJO;
        nodo.izquierda.color = NEGRO;
        nodo.derecha.color = NEGRO;
    }

    private boolean esRojo(NodoRojoNegro nodo) {
        return nodo != null && nodo.color == ROJO;
    }

}
