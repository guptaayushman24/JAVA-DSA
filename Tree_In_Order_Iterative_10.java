import java.util.*;
class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
          this.data = data;
      }
    }
public class Tree_In_Order_Iterative_10 {
    public static void Inorder(Node node){
        ArrayList<Integer> list = new ArrayList<>(); // List not needed but if you want to return the list instead of print you can add item in the list
        Stack<Node> st = new Stack<>();
        while (true){
            if (node!=null){

                st.push(node);
                node = node.left;
            }
            else{
                if (st.isEmpty()){
                    break;
                }
                node = st.pop();
                System.out.print(node.data+" ");
                node = node.right;
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

    Inorder(root);
    }
}
