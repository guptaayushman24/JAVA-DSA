import java.util.*;
public class Sliding_Window_2 {

    public static void main(String[] args) {

        int i=0;
        int j=0;
        int k=3; // Size of the window
        int [] arr = {-8, 2, 3, -6, 10};
        ArrayList<Integer> al = new ArrayList<>();
        // Starting of the sliding window algorithim
        while (j<k){
            // Do some calculation here
            if (arr[i]<0){
                al.add(arr[i]);
            }

            // Check the size of the window
            if (j-i+1<k){
                j++; // Increase the size of the window
            }
            else if (j-i+1==k){
                if (al.size()==0){
                    System.out.print("0"+" ");
            }
            else{
                System.out.print(al.get(i));
                if (arr[i]==al.get(i)){
                    al.remove(i);

                    // Now slide the window
                    i++;
                    j++;
                }
            }
        }
    }
}
}
