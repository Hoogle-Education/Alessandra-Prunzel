package util;

public class Node {

    public int index;
    public String value;
    public Node next;

    public Node(int index, String value) {
        this.index = index;
        this.value = value;
    }

    public boolean hasNext() {
        return next != null;
    }

}
