class Recursion_3{


    public static void sum_n(int i,int sum){
        if (i<1){
           System.out.println(sum);
           return;
        }
        sum_n(i-1,sum+i);

    }
    public static int sum_functional(int n){
        if (n==0){
            return 0;
        }
        return n+sum_functional(n-1);

    }

    public static int fact(int n){
        if (n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        // Parameterised function
        // Q1:- Sum of n natural number
        sum_n(4, 0);



        // Fuctional Recursion
        // Q2:- Sum of n natural numbers
        System.out.println((sum_functional(3)));

        // Q3:- Factorial of the number
        System.out.println(fact(5));


    }

}