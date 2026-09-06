public class Main {
    public static void main(String[] args) {
        MiListaDoble lista = new MiListaDoble();

        lista.add(10);
        lista.add(20);
        lista.add(30);

        System.out.println(lista.contains(20));
        System.out.println(lista.contains(50));
    }
}