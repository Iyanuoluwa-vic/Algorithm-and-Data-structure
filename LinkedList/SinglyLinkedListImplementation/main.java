package LinkedList.SinglyLinkedListImplementation;

public class main {
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.CreateSinglyLinkedList(5);
        list.InsertInSinglyLinkedList(63, 2);
        list.InsertInSinglyLinkedList(67, 4);
        list.InsertInSinglyLinkedList(87, 5);
        list.InsertInSinglyLinkedList(97, 6);
        list.traverseSinglyLinkedList();
        list.SearchForElement(60);
        list.traverseSinglyLinkedList();

    }
}
