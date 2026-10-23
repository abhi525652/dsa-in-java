

public class twoConsecutive {
    public static int twoconsecutive(int[] arr){
        int sum=0;
        int k=2;
        for(int i=0;i<2;i++){
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
        return maxsum;
    }
   public static void main(String[] args) {
     int[] arr = {2, 4,10, 6, 8,2};
    System.out.println(twoconsecutive(arr));
   } 
}
