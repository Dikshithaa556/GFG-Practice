package Arrays.RotateArrayByK;

public class ReversalAlgorithmClockwise {
    public void rotateByK(int[]arr, int k){
        int n = arr.length-1;
        k = k%n;

        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }
    public int[] reverse(int[]arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
