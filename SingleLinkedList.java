import java.util.*;



public class SingleLinkedList {
    Node head;
    private int size;
    SingleLinkedList(){
        this.size=0;
    }
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
            size++;

        }
    }
    // add->first,last
    public  void addFirst(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Printing the Linked List
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }


    // Deleting the first node from the linked list
    public void deleteFirst(){
        if (head==null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    // Deleting the last node from the linked list
    public void deleteLast(){
        if (head==null){
            System.out.println("The list is empty");
        }
        size--;
        if (head.next==null){
            head=null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next!=null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }
    public void reverseIterate(){
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList list = new SingleLinkedList();
        /*list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("list");
        list.addFirst("this");
        list.printList();


        // Calling the delete function
        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
        list.addFirst("this");

        System.out.println(list.getSize());*/


        list.printList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);

        list.reverseIterate();
        list.printList();








    }
}
