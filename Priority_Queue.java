import java.util.*;
class Priority_Queue{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(4);
        pq.add(2);
        pq.add(1);
        pq.add(3);

        System.out.println("Prority queue content is :" +pq);

        System.out.println("Head of the queue :" + pq.peek());

        // System.out.println("Head removed : " +pq.poll());

        // Now we are printing the priority queue by extracting the head so priority queue will by default will give you the mean heap

        int arr [] = new int[pq.size()];
        int i=0;
        while (pq.isEmpty()==false){
          arr[i] = pq.poll();
          i++;
        }
        for (int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
      //   System.out.println(pq.size());
      //   System.out.println(pq.poll());
      // while (pq.isEmpty()==false){
      //   System.out.print(pq.poll()+" ");
      // }
      // These will give the answer in the ascending order
    }
}