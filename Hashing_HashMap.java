import java.util.*;
public class Hashing_HashMap {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // Creating the hash map
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i=0;i<n;i++){
          if (hm.containsKey(arr[i])){
            int count = hm.get(arr[i]);

            hm.put(arr[i],count+1);
          }
          else{
            hm.put(arr[i],1);
          }
        }
        System.out.println(hm);

    }
}
