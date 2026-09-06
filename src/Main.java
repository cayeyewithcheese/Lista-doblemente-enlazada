public class Main {
    public static void main(String[] args){
        MiListaDoble lista = new MiListaDoble();

        lista.add(10);
        lista.add(20);
        lista.add(30);

        DoubleNode nodo = lista.search(20);

        if (nodo != null) {
            System.out.println(nodo.dato);
        } else {
            System.out.println("No encontrado");
        }
    }
}