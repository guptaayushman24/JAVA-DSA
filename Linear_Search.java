import java.util.*;
public class Linear_Search {


    public static int search_index(int arr[],int n,int key){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==key){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = sc.nextInt();

        int arr[] = new int[n];

        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

    System.out.println(search_index(arr, n, key));
    }
}
