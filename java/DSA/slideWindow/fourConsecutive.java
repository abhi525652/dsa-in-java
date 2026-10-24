

public class fourConsecutive {
    public static int fourconsecutive(int[] arr){
        int sum=0;
        int k=4;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        int maxsum=0;
        for(int i=k;i<arr.length;i++){
            sum=sum-arr[i-k];
            sum=sum+arr[i];
            if (sum>maxsum) {
                maxsum=sum;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
         int[] arr = {2, 4, 6, 8, 10};
         System.out.println(fourconsecutive(arr));
    }
}
