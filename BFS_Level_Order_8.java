import java.util.*;
import java.util.LinkedList;
class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
          this.data = data;
      }
    }
public class BFS_Level_Order_8 {
    public static void bfs(Node root){
        Queue <Node> queue = new LinkedList<Node>();
        queue.add(root);


        while (!queue.isEmpty()){
            Node tempNode = queue.poll();
            System.out.print(tempNode.data+" ");

            if (tempNode.left!=null){
                queue.add(tempNode.left);
            }
            if (tempNode.right!=null){
                queue.add(tempNode.right);
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

    // Printing the BFS traversal
    bfs(root);
   }
}