public class MiListaDoble implements ListInterface{

    private DoubleNode head;
    private DoubleNode tail;
    private int size;




    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;

    }

    @Override
    public Object getHead() {
        if(head == null) {
            return null;
        }
        return head.dato;
    }

    @Override
    public Object getTail() {
        if ( tail == null) {
        return null;
        }
        return tail.dato;
    }

    @Override
    public Object get(DoubleNode node) {
        if (node == null) {

        }
        return node.dato;
    }

    @Override
    public DoubleNode search(Object object) {
        return null;
    }

    @Override
    public boolean add(Object object) {
        DoubleNode nuevo = new DoubleNode(object);
        if (head == null) {
            head = nuevo;
            tail = nuevo;
        } else {
            nuevo.anterior = tail;
            tail.siguiente = nuevo;
            tail = nuevo;

        }
        size++;
        return true;

    }


    @Override
    public boolean insert(DoubleNode node, Object object) {
        return false;
    }

    @Override
    public boolean insert(Object objectRef, Object object) {
        return false;
    }

    @Override
    public boolean insertHead(Object object) {
        return false;
    }

    @Override
    public boolean insertTail(Object object) {
        return false;
    }

    @Override
    public boolean set(DoubleNode node, Object object) {
        return false;
    }

    @Override
    public boolean remove(DoubleNode node) {
        return false;
    }

    @Override
    public boolean contains(Object object) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] object) {
        return new Object[0];
    }

    @Override
    public MiListaDoble subList(DoubleNode from, DoubleNode to) {
        return null;
    }

    @Override
    public MiListaDoble sortList() {
        return null;
    }

}
