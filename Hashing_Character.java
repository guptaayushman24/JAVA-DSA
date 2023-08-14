import java.util.*;
public class Hashing_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        // Creating the hash array
        int hash_arr[] = new int[26];
        Arrays.fill(hash_arr,0);
        // Precomputation
        for (int i=0;i<str.length();i++){
            hash_arr[str.charAt(i)-'a']+=1;
        }

        System.out.println("Enter the number of query");
        int t;
        t = sc.nextInt();

        for (int i=0;i<t;i++){
            char c;
            c = sc.next().charAt(0);
            System.out.println(hash_arr[c-'a']);

        }

    }
}
