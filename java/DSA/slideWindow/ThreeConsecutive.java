

public class ThreeConsecutive {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int k=3;
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
       
       int maxsum=sum;
        for(int i=k;i<arr.length;i++){
            sum=sum-arr[i-k];
            sum=sum+arr[i];
            if (sum>maxsum) {
                maxsum=sum;
            }

        }
        System.out.println(maxsum);
    }
}
