import java.util.*;
public class Majority_Element {
    public static void main(String[] args) {

        int [] arr={1,5,6,8,2,1,4,1,4,1,2,1,5,8,2,1};
        Arrays.sort(arr);

        int index=0;
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==arr[i+1]){
                count++;
            }
            if (count>=(arr.length/2)){
                index = i;
                break;
            }

        }
        System.out.println(arr[index]);
    }
}
