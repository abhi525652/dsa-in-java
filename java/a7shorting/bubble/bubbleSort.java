package bubble;
import java.util.*;

public class bubbleSort {
    public static void bubble(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }
    //     static void printArray(int[] arr){
    //     for(int i:arr){
    //         System.out.print(i + " ");
    //     }
    //     System.out.println();
    // }
    public static void main(String[] args) {
        int[] arr={4,5,2,6,1,3};
        int n=6;
        bubble(arr, n);
         System.out.println(Arrays.toString(arr));
        //printArray(arr);
      
    }
}
