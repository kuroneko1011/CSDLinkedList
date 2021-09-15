package LinkedList;
public class Node <T>{
    T info;
    Node <T> prev, next;

    public Node(T info, Node<T> prev, Node<T> next) {
        this.info = info;
        this.prev = prev;
        this.next = next;
    }

}
