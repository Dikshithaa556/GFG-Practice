package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders{
    static ArrayList<Integer> arrayLeaders(int[]arr){
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int max = arr[n-1];
        list.add(max);
        for(int i=n-2; i>=0; i--){
            if(arr[i]>=max){
                max = arr[i];
                list.add(max);
            }
        }
        Collections.reverse(list);
        return list;
    }
}