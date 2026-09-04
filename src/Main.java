public class Main {
    public static void main(String[] args){
        MiListaDoble lista = new MiListaDoble();

        lista.add(10);
        lista.add(20);
        lista.add(30);

        System.out.println("Esta vacia?: " + lista.isEmpty());
        System.out.println("Tamaño: " + lista.getSize());
        System.out.println("Cabeza: " + lista.getHead());
        System.out.println("La cola es: " + lista.getTail());



    }
}