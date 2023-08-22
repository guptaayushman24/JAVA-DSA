import java.util.*;
public class Dequeue {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(3);
        dq.addLast(4);
        dq.addFirst(2);
        dq.addFirst(2);
        dq.offerFirst(1);
        dq.addFirst(10);
        dq.add(20); // add and addLast have thr same functionality

        System.out.println("The elements of dequeue is " +dq);

        System.out.println("First element removed :" +dq.pollFirst()); // poll and poll first have the same functionality
        System.out.println("Deque content :" +dq);

        System.out.println("Last element of deque is the " +dq.pollLast());
    }
}
