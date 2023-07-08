public class Circular_Linked_List {
      public Node head = null;
    //Represents the node of list.
    public class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    public Node getHead() {
        return head;
    }


    //Declaring head and tail pointer as null.

    public Node tail = null;

    //This function will add the new node at the end of the list.
    public void add(int data){

        //Create new node
        Node newNode = new Node(data);
        //Checks if the list is empty.
        if(head == null) {
             //If list is empty, both head and tail would point to new node.
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else {
            //tail will point to new node.
            tail.next = newNode;
            //New node will become new tail.
            tail = newNode;
            //Since, it is circular linked list tail will point to head.
            tail.next = head;
        }
    }

    //Displays all the nodes in the list
    public void display() {
         Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            System.out.println("Nodes of the circular linked list: ");
             do{
                //Prints each node by incrementing pointer.
                System.out.print(" "+ current.data);
                current = current.next;
            }while(current != head);
            System.out.println();
        }
    }
    int size=0;
    public  int getSize(){
        Node temp = head;
        Node ptr1 = head;
        while (ptr1.next!=temp){
            size++;
            ptr1 = ptr1.next;
        }
        size++;
        return size;
    }

    public static void main(String[] args) {
       Circular_Linked_List cl = new Circular_Linked_List();
        //Adds data to the list
        cl.add(1);
        cl.add(2);
        cl.add(3);
        cl.add(4);
        cl.add(5);
        cl.add(6);
        //Displays all the nodes present in the list
        cl.display();


    //    System.out.println(cl.getSize());
    Node head1=null;
    Node head2=null;
    Node temp = null;
    Node curr = cl.getHead();



    }
}