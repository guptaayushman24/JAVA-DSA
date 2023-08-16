import java.util.*;
public class RecursionLect_3 {
    public static boolean check_arr(int[] arr,int index){
        // Base Condition
        if (index==arr.length-1){
            return true;
        }
        if (arr[index]<=arr[index+1]){
            return check_arr(arr, index+1);
        }
        else{
            return false;
        }
    }
    // Function for the linear search
    static int ans=-1;

    public static int linear_search(int[]arr1,int index1,int target){

        // Base Condition
        if (index1==arr1.length-1){
            return ans;
        }
        if (arr1[index1]==target){
              ans = index1;
        }
        else{
            linear_search(arr1, index1+1, target);
        }
        return ans;
     }

    // Function for first and last occurence of the index
    public static ArrayList<Integer> findallIndex(int [] arr2,int target,int index,ArrayList<Integer> list){
        if (index==arr2.length){
            return list;
        }
        if (arr2[index]==target){
            list.add(index);
        }
        return findallIndex(arr2, target, index+1, list);

    }
    // Same as the above question now we will pass the arraylist in body not in the argument
     public static ArrayList<Integer> findallIndex2(int [] arr2,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index==arr2.length){
            return list;
        }
        if (arr2[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findallIndex(arr2, target, index+1, list);
        list.addAll(ansFromBelowCalls);

        return list;

    }

    public static int binary_search_rotated_array(int [] arr3,int s,int e,int target){
            if (s>e){
                return -1;
            }
            int mid = (s+e)/2;
            if (arr3[mid]==target){
                return mid;
            }
            if (arr3[s]<=arr3[mid]){
                if (target>=arr3[s] && target<=arr3[mid]){
                    return binary_search_rotated_array(arr3, s, mid-1, target);
                }
                else{
                    return binary_search_rotated_array(arr3, mid+1, e, target);
                }
            }
            else{
                if (target>=arr3[mid] && target<=arr3[e]){
                    return binary_search_rotated_array(arr3, mid+1, e, target);
                }
            }
            return binary_search_rotated_array(arr3, s, mid-1, target);


    }

    public static void main(String[] args) {
        // Check the array is sorted or not
        int [] arr={1,2,4,3,8,9};

        System.out.println(check_arr(arr,0));

        // Linear Search
        int [] arr1={3,2,1,18,9};
        int target=18;
        System.out.println(linear_search(arr1,0,target));

        // First and last occurence of the index
        int [] arr2={1,2,3,4,4,8};
        int target1=4;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findallIndex(arr2, target1, 0,list));

        // Return the list and dont't take it in the argument
        System.out.println(findallIndex2(arr2, 4, 0));

        // Rotated Binary Search using Recursion
        int [] arr3={5,6,7,8,9,1,2,3};
        int target2=7;
        int s = 0;
        int e = arr3.length-1;
        System.out.println(binary_search_rotated_array(arr3,s,e,target2));


    }
}
