import java.util.*;
class Hashing{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        n = sc.nextInt();
        int [] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // For precalculation create the hash array
        int hash_arr[] = new int[13];
        Arrays.fill(hash_arr,0);
        // Traversing on the original array
        for (int i=0;i<n;i++){

            hash_arr[arr[i]]+=1;

        }
        System.out.println("Enter the number of query");
        int t;
        t = sc.nextInt();

        for (int i=0;i<t;i++){
            int number;
            number = sc.nextInt();
            System.out.println(hash_arr[number]);

        }


    }
}