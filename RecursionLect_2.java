import java.util.*;
public class RecursionLect_2 {
    public static void print_rev(int n){
        // Base Condition
         if (n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        print_rev(n-1);

    }

    // Function for printing the factorial of the numeber
    public static int factorial(int n){
        if (n<=1){

            return 1;

        }
        else{
            return n*factorial(n-1);
        }
    }

    public static void print_num(int n){
        // Base Condition
        if (n==5){
            System.out.println(5);

            return;
        }
        System.out.println(n);
        print_num(n+1);

    }
     public static int sum_n(int n){
        // Base Condition
        if (n==1){
            return 1;
        }
        if (n==0){
            return 0;
        }

        return n+sum_n(n-1);
    }

     // Function for the sum of the indivisual digit in the nunmber n
    public static int sum_digit(int m){
        if (m==0){
            return 0;
        }
        return m%10+sum_digit(m/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // Printing n->1
        int n = sc.nextInt();

        print_rev(n);

        // Printing 1->n->1 (Merge print_rev and the print_num)
        print_num(1);

        // Factorial of the number n
        System.out.println(factorial(n));

        // Sum of the number n
        System.out.println(sum_n(n));

        // Sum of the indivisual digit in the nunmber n
        int m = sc.nextInt();
        System.out.println(sum_digit(m));



    }
}
