package LinkedList.Implementation;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    // Creat a singlyLinkedList
    public Node CreateSinglyLinkedList(int nodeValue) {

        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;

        head = newNode;
        tail = newNode;
        size = 1;

        return head;
    }

    // insert in a singly linked list
    public void InsertInSinglyLinkedList(int nodeValue, int location) {
        Node newNode = new Node();
        newNode.value = nodeValue;

        if (head == null) {
            CreateSinglyLinkedList(nodeValue);
            return;
        } else if (location >= size) {

            newNode.next = null;
            tail.next = newNode;
            tail = newNode;
        } else {
            Node tempNode = new Node();

            int index = 0;
            while (index <= location) {
                tempNode = head.next;
                index++;

            }
            Node nextNodeOfCurrent = tempNode.next;
            tempNode.next = newNode;
            newNode.next = nextNodeOfCurrent;

        }
        size++;

    }

    // traverse the SinglyLinked List
    public void traverseSinglyLinkedList() {
        if (head == null) {
            System.out.println("SLL does not exist!");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    // delete entire singlyLinked List
    public void deleteEntireSinglyLinkedList() {
        head = null;
        tail = null;
        System.out.println("Entire singly linked list deleted");
    }
}
