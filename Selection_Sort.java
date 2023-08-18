import java.util.*;

class Selection_Sort {
    public static int getMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];

        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 7, 8, 9, 2, 10, 66, 56 };
        for (int i=0;i<arr.length;i++){
        int last = arr.length-i-1;
        int maxIndex = getMax(arr,0,last);
        swap(arr,maxIndex,last);
    }



        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
