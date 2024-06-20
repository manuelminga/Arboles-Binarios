public class Main {
    public static void main(String[] args) {
        ArbolSimple arbolSimple = new ArbolSimple();
        arbolSimple.agregarNodo(5);
        arbolSimple.agregarNodo(3);
        arbolSimple.agregarNodo(7);
        arbolSimple.agregarNodo(2);
        arbolSimple.agregarNodo(4);

        ArbolRojoNegro arbolRojoNegro = new ArbolRojoNegro();
        arbolRojoNegro.agregarNodo(10);
        arbolRojoNegro.agregarNodo(20);
        arbolRojoNegro.agregarNodo(5);
        arbolRojoNegro.agregarNodo(6);
        arbolRojoNegro.agregarNodo(15);

        ArbolAVL arbolAVL = new ArbolAVL();
        arbolAVL.agregarNodo(30);
        arbolAVL.agregarNodo(40);
        arbolAVL.agregarNodo(35);
        arbolAVL.agregarNodo(25);
        arbolAVL.agregarNodo(20);

        System.out.println("Recorrido en orden del árbol simple:");
        arbolSimple.recorrerEnOrden();

        System.out.println("\nRecorrido en orden del árbol rojo-negro:");
        arbolRojoNegro.recorrerEnOrden();

        System.out.println("\nRecorrido en orden del árbol AVL:");
        arbolAVL.recorrerEnOrden();
    }
}
