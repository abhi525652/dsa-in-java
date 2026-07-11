public class A15MissingNum {
    
    public static void main(String[] args) {
       int[] arr={1,2,4,5,6};
       int sum=0;
       int actualSum=0;
       for(int i=0;i<arr.length;i++){
       sum=sum+arr[i];
       }
       for(int j=0;j<=6;j++){
        actualSum=actualSum+j;
       }
       
       System.out.println(actualSum-sum);
    }
}
