public class PrintMax {
    public static int max(int[] arr){
        int n=arr.length;
        int maxi=arr[0];
       for(int i=1;i<n;i++){
        if (maxi<arr[i]) {
            maxi=arr[i];
            
        }
       }return maxi;
    }
    public static void main(String[] args) {
        int[] arr={4,3,6,1,8,1};
       int result= max(arr);
        System.out.println(result);
    }
}
