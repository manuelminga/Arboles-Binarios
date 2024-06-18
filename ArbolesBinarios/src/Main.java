public class Main {
    public static void main(String[] args) {
        ArbolSimple arbolSimple = new ArbolSimple();
        // Agregar nodos al árbol simple
        // arbolSimple.agregarNodo(...);

        ArbolRojoNegro arbolRojoNegro = new ArbolRojoNegro();
        // Agregar nodos al árbol rojo-negro
        // arbolRojoNegro.agregarNodo(...);

        ArbolAVL arbolAVL = new ArbolAVL();
        // Agregar nodos al árbol AVL
        // arbolAVL.agregar
        // arbolAVL.agregarNodo(...);

        // Ejemplo de recorrido en orden de los árboles
        System.out.println("Recorrido en orden del árbol simple:");
        arbolSimple.recorrerEnOrden();

        System.out.println("\nRecorrido en orden del árbol rojo-negro:");
        arbolRojoNegro.recorrerEnOrden();

        System.out.println("\nRecorrido en orden del árbol AVL:");
        arbolAVL.recorrerEnOrden();
    }
}
