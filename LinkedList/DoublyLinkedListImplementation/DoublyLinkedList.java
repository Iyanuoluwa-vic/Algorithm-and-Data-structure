package LinkedList.DoublyLinkedListImplementation;

public class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    public void CreateDoublyLinkedList() {
        DoublyNode node = new DoublyNode();

        node.next = null;
        node.prev = null;
        head = node;
        tail = node;
        size = 1;

    }

    public void insertionDoublyLinkedList(int value, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = value;

        if (head == null) {
            CreateDoublyLinkedList();
        }

        if (location == 0) {
            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            tail = newNode;
        } else if (location >= size) {
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = null;
            tail = newNode;
        } else {
            int i = 0;
            DoublyNode temp = new DoublyNode();
            temp = head;
            while (i < location - 1) {
                temp = temp.next;
            }

            newNode.prev = temp;
            newNode.next = temp.next;
            temp.next = newNode;
            newNode.next.prev = newNode;
        }

    }

}
