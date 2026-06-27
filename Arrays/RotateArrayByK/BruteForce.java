package Arrays.RotateArrayByK;

public class BruteForce {
    //Anticlocķwise rotation
    public void rotateByK(int[] arr, int k){
        int n =arr.length;
        for(int i=0; i<k; i++){
            int first = arr[0];
            for(int j=0; j<arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = first;
        }
    }  

    //Clockwise rotation
    public void rotateByKRight(int[] arr, int k){
        int n = arr.length;
        for(int i=0; i<k; i++){
            int last = arr[n-1];
            for(int j=n-2; j>=0; j--){
                arr[j+1] = arr[j];
            }
            arr[0] = last;
        }
    }
}
