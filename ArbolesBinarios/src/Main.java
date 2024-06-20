public class Main {
    public static void main(String[] args) {
        ArbolSimple arbolSimple = new ArbolSimple();
        arbolSimple.agregarNodo(57);
        arbolSimple.agregarNodo(20);
        arbolSimple.agregarNodo(7);

        ArbolRojoNegro arbolRojoNegro = new ArbolRojoNegro();
        arbolRojoNegro.agregarNodo(10);
        arbolRojoNegro.agregarNodo(80);
        arbolRojoNegro.agregarNodo(5);

        ArbolAVL arbolAVL = new ArbolAVL();
        arbolAVL.agregarNodo(34);
        arbolAVL.agregarNodo(200);
        arbolAVL.agregarNodo(455);

        // Ejemplo de recorrido en orden de los árboles
        System.out.println("Recorrido en orden del árbol simple:");
        arbolSimple.recorrerEnOrden();

        System.out.println("\nRecorrido en orden del árbol rojo-negro:");
        arbolRojoNegro.recorrerEnOrden();

        System.out.println("\nRecorrido en orden del árbol AVL:");
        arbolAVL.recorrerEnOrden();
    }
}
