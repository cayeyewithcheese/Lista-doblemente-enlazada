public class Main {
    public static void main(String[] args) {
            MiListaDoble lista = new MiListaDoble();

            lista.add(10);
            lista.add(20);
            lista.add(30);

            lista.insertHead(5);

            DoubleNode actual = lista.search(5);

            while (actual != null) {
                System.out.print(actual.dato + " ");
                actual = actual.siguiente;
            }
        }
    }
