package LinkedList;

public class LinkedList<T> {
    private Node<T> head, tail;

    public LinkedList() {
        head = tail = null;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void addFirst(T el) {
        if (isEmpty())
            head = tail = new Node<T>(el, null, null);
        else {
            Node<T> q = new Node<T>(el, null, head);
            head = q;
        }
    }

    public void addLast(T el) {
        if (isEmpty())
            head = tail = new Node<T>(el, null, null);
        else {
            Node<T> q = new Node<T>(el, tail, null);
            tail.next = q;
            tail = q;
        }
    }

    public void deleteFirst() {
        if (isEmpty())
            System.out.println("There is nothing to delete");
        else {
            head = head.next;
        }
    }

    public void deleteLast() {
        if (isEmpty())
            System.out.println("There is nothing to delete");
        else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public int size() {
        Node<T> q = head;
        int count = 0;
        while (q != null) {
            count++;
            q = q.next;
        }
        return count;
    }

    public void delete(T el) {
        if (isEmpty())
            System.out.println("There is nothing to delete");
        else if (el.equals(head.info)) {
            head = head.next;
        } else {
            Node<T> pred, tmp;
            for (pred = head, tmp = head.next; tmp != null && !(tmp.info.equals(el)); pred = pred.next, tmp = tmp.next)
                ;
            if (tmp != null) {
                pred.next = tmp.next;
                if (tmp == tail)
                    tail = pred;
            }
        }
    }

    public void printAll() {
        for (Node<T> tmp = head; tmp != null; tmp = tmp.next) {
            System.out.println(tmp.info);
        }
    }

    public boolean isInList(T el) {
        Node<T> tmp;
        for (tmp = head; tmp != null && !tmp.info.equals(el); tmp = tmp.next)
            ;
        return tmp != null;
    }
}
