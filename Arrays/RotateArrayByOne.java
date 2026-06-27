package Arrays;

public class RotateArrayByOne {
    //Clockwise rotation
    public void rotate(int[] arr) {
        int n = arr.length;
        int last = arr[n-1];
        for(int i=n-1; i>0; i--){
            arr[i] = arr[i-1];
        }
         arr[0] = last;
    }

    //Anticlockwise rotation
    public void rotateLeft(int[] arr) {
        int n = arr.length;
        int first = arr[0];
        for(int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = first;
    }
    
}
