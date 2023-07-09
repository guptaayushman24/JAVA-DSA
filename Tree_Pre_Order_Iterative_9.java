import java.util.*;
class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
          this.data = data;
      }
    }
public class Tree_Pre_Order_Iterative_9 {
    public static void pre_order(Node node){
        Stack<Node> st = new Stack<Node>();
        st.push(node);
        while (st.empty() == false) {

            // Pop the top item from stack and print it
            Node mynode = st.peek();

            System.out.print(mynode.data + " ");
            st.pop();

            // Push right and left children of the popped node to stack
            if (mynode.right != null) {
                st.push(mynode.right);
            }
            if (mynode.left != null) {
                st.push(mynode.left);
            }
        }




    }
    public static void main(String[] args) {

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

        pre_order(root);
    }


}
