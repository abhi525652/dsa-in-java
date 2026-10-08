import java.util.Arrays;

public class printArrToString {
    public static void main(String[] args) {
        int[] arr={2,5,7,9,4,2};
       int[] even=Arrays.stream(arr).filter(n->n%2==0).toArray();      // for (int n : arr)  //  if (n % 2 == 0) {  keep n  }}
       int[] odd=Arrays.stream(arr).filter(n->n%2!=0).toArray();
       System.out.println("even: "+Arrays.toString(even));
       System.out.println("odd:"+Arrays.toString(odd));
    }
}
