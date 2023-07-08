import java.util.*;
public class LinkedListJCFM {

  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
    list.addFirst("a");
    list.addFirst("is");
    System.out.println(list);

    list.addFirst("this");
    list.addLast("list");
    System.out.println(list);
    System.out.println(list.size());

    // By default the list will add the element in the last


    // Printing the linkedlist
    for (int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" -> ");
    }
    System.out.println("NULL");

     // Delete First
     list.removeFirst();
     for (int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" -> ");
    }
    System.out.println("NULL");
    // Delete Last
    list.removeLast();
    for (int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" -> ");
    }
    System.out.println("NULL");


    // Removing the element from the index
    list.remove(1);
    for (int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" -> ");
    }
    System.out.println("NULL");


  }


}
