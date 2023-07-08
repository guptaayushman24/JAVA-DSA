public class Leader {
    public static void main(String[] args) {

       int [] arr = {16,17,4,3,5,2};
       // Last Element will always be the leader in the array becaues it is the rightmost
       int leader = arr[arr.length-1];
       System.out.print(arr[arr.length-1]+" ");

       for (int i=arr.length-2;i>=0;i--){
            if (arr[i]>leader){
                leader = arr[i];
                System.out.print(leader+" ");
            }
       }
    }
}
