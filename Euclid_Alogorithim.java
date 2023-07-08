import java.util.*;
public class Euclid_Alogorithim {

    public static int find_gcd(int a,int b){
        if (a==0){
            return b;
        }
        return find_gcd(b%a, a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();


        System.out.println((find_gcd(x, y)));
    }
}
