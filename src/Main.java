public class Main {
    public static void main(String[] args){
        MiListaDoble lista = new MiListaDoble();

        System.out.println("ADD ");
        lista.add(10.0);
        lista.add(20.0);
        lista.add(30.0);
        lista.add(40.0);

        
        System.out.println("Cabeza: " + lista.getHead());


    }
}