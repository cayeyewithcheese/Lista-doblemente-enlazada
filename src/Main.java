public class Main {
    public static void main(String[] args) {
        MiListaDoble lista = new MiListaDoble();

        lista.add(10);
        lista.add(20);
        lista.add(30);

        Object[] array = lista.toArray();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}