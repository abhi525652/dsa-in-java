import java.util.Arrays;

public class SelectionSort {
    public static void selection(int[] arr){
        int start=arr.length;
       for(int i=0;i<start-1;i++){
          int smallestIdx=i;
          for(int j=i+1;j<start;j++){
            if (arr[j]<arr[smallestIdx]) {
                smallestIdx=j;
            }
          }
         int temp=arr[smallestIdx];
         arr[smallestIdx]=arr[i];
         arr[i]=temp;
       }
      
    }
    public static void main(String[] args) {
        int[] arr={13,1,4,6,7,9};
        System.out.println("Original "+Arrays.toString(arr));
        selection(arr);
        System.out.println("sorted array "+Arrays.toString(arr));
    }
}
