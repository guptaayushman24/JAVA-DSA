import java.util.Scanner;

public class Binary_Search {
    public static int search_index_binary(int arr[],int n,int key,int high,int low){
         low = 0;
         high = n-1;
        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid]==key){
                return arr[mid];
            }
            else if (arr[mid]<key){
                low = mid+1;
            }
            else{ // arr[mid]>key
                high = mid-1;

            }
        }

        return -1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = sc.nextInt();
        int [] arr = new int [n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println( search_index_binary(arr, n, key, n, key));
    }
}
