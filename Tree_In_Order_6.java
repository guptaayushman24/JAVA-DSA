import java.util.*;
class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
          this.data = data;
      }
    }
public class Tree_In_Order_6{
   public static void in_order(Node node){
      if (node==null){
        return;
      }
      in_order(node.left);

      // Calling the funciton recursively

      System.out.print(node.data+" ");
      in_order(node.right);

    }

public static void main(String[] args) {


    /*Node root = new Node(1);  // I have created the root node
    root.left = new Node(2);

    root.right = new Node(3);
    root.right.left = new Node(5);*/

    Node root = new  Node(1);
    root.left = new Node(2);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.left.right.left = new Node(6);
    root.right = new Node(3);
    root.right.left = new Node(7);
    root.right.right = new Node(8);
    root.right.right.left = new Node(9);
    root.right.right.right = new Node(10);


  // In-order Traversal code
  System.out.println("In order traversal of the above tree is");
  in_order(root);
}
}










