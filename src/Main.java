public class Main {
    public static void main(String[] args) {
        MiListaDoble lista = new MiListaDoble();

        lista.add(30);
        lista.add(10);
        lista.add(40);
        lista.add(20);

        MiListaDoble ordenada = lista.sortList();

        Object[] arreglo = ordenada.toArray();

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}