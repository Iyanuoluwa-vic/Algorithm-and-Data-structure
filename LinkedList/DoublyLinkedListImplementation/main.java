package LinkedList.DoublyLinkedListImplementation;

import java.util.List;

public class main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.CreateDoublyLinkedList(4);
        list.insertionDoublyLinkedList(5, 1);
        list.insertionDoublyLinkedList(45, 2);
        list.insertionDoublyLinkedList(9, 3);
        list.insertionDoublyLinkedList(3, 4);
        list.traverseDoublyLinkedList();

    }

}
