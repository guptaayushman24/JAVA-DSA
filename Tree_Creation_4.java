class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
          this.data = data;
      }
    }
public class Tree_Creation_4{

public static void main(String[] args) {


    Node root = new Node(1);  // I have created the root node
    root.left = new Node(2);

    root.right = new Node(3);
    root.right.left = new Node(5);


}
}