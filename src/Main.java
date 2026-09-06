public class Main {
    public static void main(String[] args) {
        MiListaDoble lista = new MiListaDoble();

        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);

        DoubleNode from = lista.search(20);
        DoubleNode to = lista.search(40);

        MiListaDoble nuevaLista = lista.subList(from, to);

        Object[] arreglo = nuevaLista.toArray();

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}