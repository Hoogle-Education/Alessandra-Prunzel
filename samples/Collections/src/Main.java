import util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add("Joao");
        list.add("Maria");
        list.add("Lais");
        list.add("Pedro");

         list.insert(1, "Jonas");

        System.out.println(list.printList());
    }
}