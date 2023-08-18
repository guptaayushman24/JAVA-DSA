public class Recursion_Lect4 {
    // Function for printing the star pattern
    public static void triangle (int r,int c){
        if (r==0){
            return;
        }
        if (c<r){
            System.out.print("*"+" ");
            triangle(r,c+1);

        }
        else{
            System.out.println();
            triangle(r-1, 0);
        }
    }


    // Function for the bubble sort
    public static void bubble_sort(int [] arr,int n){
       if (n==1){
         return;
       }
       else{
       for (int i=0;i<n-1;i++){
        if (arr[i]>arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
       }
       bubble_sort(arr, n-1);
    }
}

    public static void print_arr(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        // Pattern Question using recursion
        // Q1:- Printing the triangle pattern
        triangle(4, 0);

        // Bubble Sort using recursion
        int [] arr={4,3,2,1};
        int s = 0;
        int e = arr.length-1;
        print_arr(arr);
        bubble_sort(arr,arr.length);
        print_arr(arr);


    }
}
