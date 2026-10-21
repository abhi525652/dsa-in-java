

public class AddPairToTarget {
    public static void main(String[] args) {
          int[] arr={1,2,3,4,5,6};
          int target=10;
          int left=0;
          int right=arr.length-1;
          while (right>left) {
            int sum=arr[left]+arr[right];
            if (sum==target) {
                System.out.println("Pair found ");
                System.out.println(arr[left]+" -> "+ arr[right]);
                break;
            }else if(sum<target){
               left++;
            }
            else{
                right--;
            }
          }
    }
}
