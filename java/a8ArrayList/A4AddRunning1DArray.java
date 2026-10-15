import java.util.ArrayList;
import java.util.Arrays;

public class A4AddRunning1DArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] a= AddArray(arr);
      System.out.println(Arrays.toString(a));
    }
    public static int[] AddArray(int[] arr){
       int[] result= new int[arr.length];
        result[0]=arr[0];
        for(int i=1;i>arr.length;i++){
            result[i]=result[i-1]+arr[i];
        }
         return result;
    }
}
