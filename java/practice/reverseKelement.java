import java.util.Arrays;

public class reverseKelement {
    public static void reverse(int[]num,int left,int right){
        while(left<right){
            int temp=num[left];
            num[left]=num[right];
            num[right]=temp;
            right--;
            left++;
        }
    }
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7};
        int n=num.length;
        int k=3;
        k=k%n;
       reverse(num, 0,n-1);
        reverse(num, 0, k-1);
         reverse(num, k, n-1);
        System.out.println(Arrays.toString(num));
    
    }
}
