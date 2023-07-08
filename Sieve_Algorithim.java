import java.util.*;
public class Sieve_Algorithim{

    public static void sievealgorithim (int n){
        boolean prime[] = new boolean[n+1];
        for (int i=0;i<=n;i++){
            prime[i] = true;
        }
        for (int p=2;p*p<=n;p++){
            if (prime[p]==true){
                // Now we have to the multiple of p to be false
                for (int i=p*p;i<=n;i+=p){
                    prime[i] = false;
                }
            }
        }

        // Now printing the prime number
        for (int i=2;i<=n;i++){
            if (prime[i]==true){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
        // Sieve Algorithim
        sievealgorithim(n);


    }
}