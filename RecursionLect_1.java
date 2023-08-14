public class RecursionLect_1 {
    // Here we are doing the repetation of the function
    // If we have to print 1 lac number it is not possible to create 1 lac number
    /*public static void print1(int n){
        System.out.println(n);
        print2(2);
    }
    public static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    public static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    public static void print4(int n){

        System.out.println(n);
        print5(5);

    }
     public static void print5(int n){ # In these function function body changes
        System.out.println(n);
     }*/

     // New function
     // Function for printing the first 5 number using recursion
     public static void print(int n){
        if (n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
     }

      // Function for printing the nth fibonachii number
     public static int fibo(int n){
        // Base Condition
        if (n<2){
            return n;
        }
        return (fibo(n-1)+fibo(n-2));
     }

      // Function for binary search using recursion
      public static int search(int []arr,int target,int s,int e){
        // Base Condition
        if (s>e){
            return -1;
        }
        int mid = (s+e)/2;
        if (arr[mid]==target){
            return mid;
        }
        else if (arr[mid]>target){
            return search(arr, target, s, mid-1);
        }
        else{
            return search(arr, target, mid+1, e);
        }
      }


    public static void main(String[] args) {
    // print1(1);
    // Printing the first 5 number using recursion
    print(1);

    // Printing the nth fibonachii number
    System.out.println(fibo(6));

    // Binary Search using recursion
    int []arr={1,2,3,4,5,66,77,88};
    int target=77;
    int s=0;
    int e=arr.length-1;
    System.out.println(search(arr,target, s, e));





    }


}
