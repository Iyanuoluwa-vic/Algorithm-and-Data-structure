package LinkedList.DoublyLinkedListImplementation;

public class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    public void CreateDoublyLinkedList(int value) {
        DoublyNode node = new DoublyNode();
        node.value = value;
        node.next = null;
        node.prev = null;
        head = node;
        tail = node;
        size = 1;

    }

    // Implementation of insertion
    public void insertionDoublyLinkedList(int value, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = value;

        if (head == null) {
            CreateDoublyLinkedList(value);
            return;
        }

        if (location == 0) {
            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) {
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = null;
            tail = newNode;
        } else {
            DoublyNode temp = head;
            int i = 0;
            while (i < location - 1) {
                temp = temp.next;
                i++;
            }

            newNode.prev = temp;
            newNode.next = temp.next;
            temp.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;

    }

    // traverse a doubly Linked List
    public void traverseDoublyLinkedList() {

        DoublyNode temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value);
            System.out.print(" ");
            temp = temp.next;
        }
        System.out.println();

    }

    public void deleteEntireLinkedList() {
        head = null;
        tail = null;
        size = 0;

    }
}
