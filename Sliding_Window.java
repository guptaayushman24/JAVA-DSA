public class Sliding_Window {
    public static void main(String[] args) {
        // Calculating the maximum sum array sum of the particular size
        // Approaach Used->Sliding Window (Fixed Window)
        int arr [] = {100, 200, 300, 400};
        int i=0;
        int j=0;
        int sum=0;
        int maxi = Integer.MIN_VALUE;
        int k=2; // Size of the sliding window
        while (j<arr.length){
            sum = sum + arr[j];
            if (j-i+1<k){
                j++; // Increasing the size of the window because it is less than k
            }
            else if (j-i+1==k){

                maxi = Math.max(sum,maxi);
                sum = sum-arr[i];
                i++; // Seeing the new window
                j++; // By increasing the i and j
            }
        }
        System.out.println(maxi);
    }

}
