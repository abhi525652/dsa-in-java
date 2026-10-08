public class A13Palindrome{
    public static void main(String[] args) {
       int[] arr={1,2,3,4,5,4,3,2,1,7};
       int left=0;
       int right=arr.length-1;
       boolean ispalindrome=true;
      while (left<right) {
        if (arr[left]==arr[right]) {
            left++;
            right--;
        }else{
            ispalindrome=false;
            break;
        }
        }
        if (ispalindrome) {
            System.out.println("the num is palindrome");
        }else{
            System.out.println("the num is not palindrome");
        }

       }

    
}