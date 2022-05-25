package LinkedList.Implementation;

public class main {
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.CreateSinglyLinkedList(5);
        list.InsertInSinglyLinkedList(63, 2);
        list.InsertInSinglyLinkedList(67, 4);
        list.traverseSinglyLinkedList();
        list.deleteEntireSinglyLinkedList();
    }
}
