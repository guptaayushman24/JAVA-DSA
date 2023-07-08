import java.util.*;
class Binary_Palindrome{
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        String store="";
        String rev_store="";
        while (n>0){
            int remider = n%2;
            store = Integer.toString(remider)+store;
            n=n/2;
        }

        // System.out.println(store); Printing the binary number
        for (int i=store.length()-1;i>=0;i--){

            rev_store = rev_store+store.charAt(i);

        }
        // System.out.println(rev_store); // Printing the binary number in reverse
        if (store.equals(rev_store)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}