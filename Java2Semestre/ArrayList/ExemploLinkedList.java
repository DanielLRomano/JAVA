package ArrayList;

import java.util.LinkedList;

public class ExemploLinkedList {
    public static void main(String[] args) {

        LinkedList<String> flores = new LinkedList<>();

        flores.add("Rosa");
        flores.add("Margaridas");
        flores.addFirst("Begônias");
        flores.addLast("Cravos");
        System.out.println(flores.getFirst());
        System.out.println(flores.getLast());
    }
}
