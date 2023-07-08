import java.util.*;
class Recursion_5{
    public static int nthfibanachno(int n){
        if (n<=1){
            return n;
        }
        int last = nthfibanachno(n-1);
        int secondlast = nthfibanachno(n-2);
        return last+secondlast;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nthfibanachno(n));
    }
}