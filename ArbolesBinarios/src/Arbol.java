public abstract class Arbol {
    protected Nodo raiz;

    public Arbol() {
        this.raiz = null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public abstract void recorrerEnOrden();

    public abstract void recorrerPreOrden();

    public abstract void recorrerPostOrden();
}
