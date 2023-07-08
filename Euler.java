import java.util.*;
public class Euler {
    public static void totient(int totient[],int n){
        for (int i=0;i<n;i++){
            totient[i] = i;
        }
        for (int i=2;i<n;i++){
            if (totient[i]==i){ // prime
                for (int j=2*i;j<n;j+=i){
                    totient[j]*=i-1;
                    totient[j]/=i;
                }
                totient[i] = i-1;
            }
        }
        for (int i=2;i<n;i++){
            System.out.print(totient[i]+" ");

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] totient = new int[n];
        for (int i=0;i<n;i++){
            totient[i] = sc.nextInt();
        }
        totient(totient,n);

    }
}
