public class A11Palindrome {
     public static void main(String[] args) {
        String name="mdam";
        int left=0;
        int right=name.length()-1;
       while (left<right) {
        if (name.charAt(left)!=name.charAt(right)) {
            System.out.println("not palindrom");
            return;
        }
            left++;
            right--;
           }System.out.println("yes palindrom");
        }
}
