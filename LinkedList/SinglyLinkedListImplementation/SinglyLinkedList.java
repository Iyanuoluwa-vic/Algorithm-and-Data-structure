package LinkedList.SinglyLinkedListImplementation;

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

    // Search for an element in a linked List
    public void SearchForElement(int element) {

        if (head == null) {
            System.out.println("The linked List does not exist");
            return;
        }

        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.value == element) {
                System.out.println("The value was located in the linked List");
                return;
            }
            temp = temp.next;
        }
        System.out.println("The value was not located in the linked List");
    }

    // delete entire singlyLinked List
    public void deleteEntireSinglyLinkedList() {
        head = null;
        tail = null;
        System.out.println("Entire singly linked list deleted");
    }
}
