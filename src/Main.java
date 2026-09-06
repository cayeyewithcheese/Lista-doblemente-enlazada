public class Main {
    public static void main(String[] args) {
        MiListaDoble lista = new MiListaDoble();

        lista.add(10);
        lista.add(20);
        lista.add(30);

        DoubleNode nodo = lista.search(20);

        lista.remove(nodo);

        DoubleNode actual = lista.search(10);

        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }

        System.out.println("Tamaño: " + lista.getSize());
    }
}