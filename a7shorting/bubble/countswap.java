import java.util.Arrays;

public class countswap {
    public static int countSwap(int[] arr){
        int count=0;
        int n=arr.length;
        
        for(int i=1;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if (arr[j]>arr[j+1]) {
                      int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    count++;
                }
            }
           
        }return count;
    }
public static void main(String[] args) {
    int[] arr={4, 5, 2, 6, 1, 3};
    System.out.println("Original "+Arrays.toString(arr));
    System.out.println("the count of swap ="+countSwap(arr));
    System.out.println(Arrays.toString(arr));
}
}
