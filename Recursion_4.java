public class Recursion_4 {
    public static void swap(int [] arr,int i,int j){
        if (i>=j){
            return;
        }
        int temp= arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
        swap(arr,i,j);

    }
    public static void print_arr(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static boolean check_palindrome(String s,int i){
        if (i>=s.length()/2){
            return true;
        }
        if (s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }
        return check_palindrome(s, i+1);
    }




    public static void main(String[] args) {
        // Q1:- Reversing the array using recursion
        int [] arr={1,2,3,4};

        swap(arr,0,arr.length-1);
        print_arr(arr);


        // Q2:- Checking the string is palindrome or not
        // Left and Right half sholuld be the same
        String s = "madam";
        System.out.println(check_palindrome("madam",0));



    }
}
