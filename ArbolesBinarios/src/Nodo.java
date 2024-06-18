    public class Nodo {
        protected int dato;
        private Nodo izquierda;
        private Nodo derecha;

        public Nodo(int dato) {
            this.dato = dato;
            this.izquierda = null;
            this.derecha = null;
        }

        public int buscarDato() {
            return this.dato;
        }

        public boolean buscarTipoNodo() {
            // Retorna true si el nodo es una hoja (no tiene hijos)
            return this.izquierda == null && this.derecha == null;
        }

        // Getters y Setters para los atributos izquierda y derecha
        public Nodo getIzquierda() {
            return izquierda;
        }

        public void setIzquierda(Nodo izquierda) {
            this.izquierda = izquierda;
        }

        public Nodo getDerecha() {
            return derecha;
        }

        public void setDerecha(Nodo derecha) {
            this.derecha = derecha;
        }
    }


