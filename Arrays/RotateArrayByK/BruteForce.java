package Arrays.RotateArrayByK;

public class BruteForce {
    public void rotateByK(int[] arr, int k){
        for(int i=0; i<k; i++){
            int first = arr[0];
            for(int j=0; j<arr.length-2; i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = first;
        }
    }   
}
