import java.util.*;
public class Alice_apples {
    public static int apples(int m,int k,int n,int s,int w,int e){
        if (s*k>=m){
            return m;
        }
        else if (s*k+e+w>=m){
            return (s*k+(m-s*k)*k);
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);


        int m = sc.nextInt();
        int k = sc.nextInt();
        int n = sc.nextInt();
        int s = sc.nextInt();
        int w = sc.nextInt();
        int e = sc.nextInt();
        // Calling the function apples

        System.out.println(apples(m, k, n, s, w, e));
    }
}
