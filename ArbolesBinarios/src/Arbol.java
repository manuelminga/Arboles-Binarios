public abstract class Arbol {
    protected  nodo raiz;
    protected nodo rama;
    protected nodo hojas;


    public abstract void recorrerEnOrden();

    public abstract void recorrerPreOrden();

    public abstract void recorrerPostOrden();
}
