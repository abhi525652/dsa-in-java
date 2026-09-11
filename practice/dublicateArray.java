import java.util.Arrays;

public class dublicateArray {
    public  static void dublicate(int[] arr){
       Arrays.sort(arr);
       System.out.print("Dublicate = ");
        for(int i=1;i<arr.length;i++){
            if (arr[i]==arr[i-1]) {
                System.out.println(arr[i]);
            }

        }
    }
    public static void main(String[] args) {
        int[] arr={5,3,2,2,1};
        dublicate(arr);
    }
}
