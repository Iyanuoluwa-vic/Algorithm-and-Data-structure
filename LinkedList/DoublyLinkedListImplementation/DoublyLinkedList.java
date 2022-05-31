package LinkedList.DoublyLinkedListImplementation;

import Array.TwoSum.TwoSum;

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
        } else if (location == 0) {
            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;

        } else if (location >= size) {
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
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
        DoublyNode temp = head;
        for (int i = 0; i < size; i++) {
            temp.prev = null;
            temp = temp.next;
        }
        head = null;
        tail = null;
        size = 0;

    }

    public void deleteDoublyLinkedList(int location) {

        if (head == null) {
            System.out.println("The Doubly Link List is already empty");
            return;
        } else if (location == 0) {
            if (size == 1) {
                head = null;
                tail = null;
                size--;
            } else {
                head = head.next;
                head.prev = null;
                size--;
            }

        } else if (location >= size - 1) {
            DoublyNode temp = tail.prev;
            if (size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            } else {
                temp.next = null;
                tail = temp;
                size--;
            }
        } else {
            DoublyNode temp = head;

            for (int i = 0; i < location - 1; i++) {
                temp = temp.next;
            }

            if (location < size)
                temp.next = temp.next.next;
            temp.next.prev = temp;
            size--;
        }

    }

}
