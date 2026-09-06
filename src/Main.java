public class Main {
    public static void main(String[] args) {
        MiListaDoble lista = new MiListaDoble();

        lista.add(10);
        lista.add(20);
        lista.add(30);

        Object[] arreglo = new Object[3];

        arreglo = lista.toArray(arreglo);

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}