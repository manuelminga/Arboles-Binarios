public class ArbolAVL extends Arbol {
    private static class NodoAVL extends Nodo {
        int altura;

        NodoAVL(int valor) {
            super(valor);
            this.altura = 1; // La altura inicial de un nodo recién insertado es 1
        }
    }

    public ArbolAVL() {
        this.setRaiz(null);
    }

    @Override
    public void recorrerEnOrden() {
        recorrerEnOrden((NodoAVL) this.getRaiz());
    }

    private void recorrerEnOrden(NodoAVL nodo) {
        if (nodo != null) {
            recorrerEnOrden((NodoAVL) nodo.getIzquierda());
            System.out.print(nodo.getDato() + " ");
            recorrerEnOrden((NodoAVL) nodo.getDerecha());
        }
    }

    @Override
    public void recorrerPreOrden() {
        recorrerPreOrden((NodoAVL) this.getRaiz());
    }

    private void recorrerPreOrden(NodoAVL nodo) {
        if (nodo != null) {
            System.out.print(nodo.getDato() + " ");
            recorrerPreOrden((NodoAVL) nodo.getIzquierda());
            recorrerPreOrden((NodoAVL) nodo.getDerecha());
        }
    }

    @Override
    public void recorrerPostOrden() {
        recorrerPostOrden((NodoAVL) this.getRaiz());
    }

    private void recorrerPostOrden(NodoAVL nodo) {
        if (nodo != null) {
            recorrerPostOrden((NodoAVL) nodo.getIzquierda());
            recorrerPostOrden((NodoAVL) nodo.getDerecha());
            System.out.print(nodo.getDato() + " ");
        }
    }

    @Override
    public void agregarNodo(int dato) {
        raiz = agregarNodo((NodoAVL) raiz, dato);
    }

    private NodoAVL agregarNodo(NodoAVL nodo, int dato) {
        if (nodo == null) {
            return new NodoAVL(dato);
        }

        if (dato < nodo.getDato()) {
            nodo.setIzquierda(agregarNodo((NodoAVL) nodo.getIzquierda(), dato));
        } else if (dato > nodo.getDato()) {
            nodo.setDerecha(agregarNodo((NodoAVL) nodo.getDerecha(), dato));
        } else {
            return nodo; // Los valores duplicados no están permitidos
        }

        nodo.altura = 1 + Math.max(altura((NodoAVL) nodo.getIzquierda()), altura((NodoAVL) nodo.getDerecha()));

        int balance = getBalance(nodo);

        // Rotaciones para balancear el árbol
        // Rotación derecha
        if (balance > 1 && dato < nodo.getIzquierda().getDato()) {
            return rotacionDerecha(nodo);
        }

        // Rotación izquierda
        if (balance < -1 && dato > nodo.getDerecha().getDato()) {
            return rotacionIzquierda(nodo);
        }

        // Rotación izquierda-derecha
        if (balance > 1 && dato > nodo.getIzquierda().getDato()) {
            nodo.setIzquierda(rotacionIzquierda((NodoAVL) nodo.getIzquierda()));
            return rotacionDerecha(nodo);
        }

        // Rotación derecha-izquierda
        if (balance < -1 && dato < nodo.getDerecha().getDato()) {
            nodo.setDerecha(rotacionDerecha((NodoAVL) nodo.getDerecha()));
            return rotacionIzquierda(nodo);
        }

        return nodo;
    }

    private NodoAVL rotacionDerecha(NodoAVL y) {
        NodoAVL x = (NodoAVL) y.getIzquierda();
        NodoAVL T2 = (NodoAVL) x.getDerecha();

        x.setDerecha(y);
        y.setIzquierda(T2);

        y.altura = Math.max(altura((NodoAVL) y.getIzquierda()), altura((NodoAVL) y.getDerecha())) + 1;
        x.altura = Math.max(altura((NodoAVL) x.getIzquierda()), altura((NodoAVL) x.getDerecha())) + 1;

        return x;
    }

    private NodoAVL rotacionIzquierda(NodoAVL x) {
        NodoAVL y = (NodoAVL) x.getDerecha();
        NodoAVL T2 = (NodoAVL) y.getIzquierda();

        y.setIzquierda(x);
        x.setDerecha(T2);

        x.altura = Math.max(altura((NodoAVL) x.getIzquierda()), altura((NodoAVL) x.getDerecha())) + 1;
        y.altura = Math.max(altura((NodoAVL) y.getIzquierda()), altura((NodoAVL) y.getDerecha())) + 1;

        return y;
    }

    private int altura(NodoAVL nodo) {
        return nodo == null ? 0 : nodo.altura;
    }

    private int getBalance(NodoAVL nodo) {
        return nodo == null ? 0 : altura((NodoAVL) nodo.getIzquierda()) - altura((NodoAVL) nodo.getDerecha());
    }
}
