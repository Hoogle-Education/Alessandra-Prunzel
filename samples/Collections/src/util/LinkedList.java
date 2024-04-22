package util;

public class LinkedList {

    public Node first;
    public Node last;
    public int size = 0;

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

    public void add(String value) {
        if(isEmpty()) {
            first = new Node(size, value);
            last = first;
            size++;
            return;
        }

        last.next = new Node(size, value);
        last = last.next;
        size++;
    }

    public void insert(int index, String value) {
        if(index < 0 || index >= size) {
            throw new IllegalArgumentException("index out of range");
        }

        Node current = first;
        int pos = 0;

        while(pos < index) {
            current = current.next;
            pos++;
        }

        Node aux = current.next;
        current.next = new Node(size, value);
        size++;
        current.next.next = aux;
    }

    public String printList() {
        String aux = "";

        Node current = first;
        while(current != null) {
            aux += current.value + " -> ";
            current = current.next;
        }

        aux += "null";

        return aux;
    }
}

// Joao -> Maria -> null
//   f       l

// Joao -> Maria -> Jonas -> Lais -> Pedro -> null
//   f                        a         l
