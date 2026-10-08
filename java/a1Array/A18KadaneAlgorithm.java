public class A18KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr={-2,4,-3,4,2,-3,-5,-6,6,2,1};
        int currsum=arr[0];
        int sumMax=arr[0];
        for(int i=1;i<arr.length;i++){
            currsum=Math.max(arr[i], currsum+arr[i]);
            sumMax=Math.max(sumMax, currsum);
        }
        System.out.println("Max value of the sum = "+sumMax);
    }
}
