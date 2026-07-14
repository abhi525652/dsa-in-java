public class A12ValidPalindrome {
     public static void main(String[] args) {
       String name= "A man, a plan, a canal: Panama";
        int left=0;
        int right=name.length()-1;
        boolean isPalindrom=true;
       while (left<right) {
        if (!Character.isLetterOrDigit(name.charAt(left))) {
            left++;
        }else if (!Character.isLetterOrDigit(name.charAt(right))) {
            right--;
        }else{
            char leftchar = Character.toLowerCase(name.charAt(left));
            char rightchar = Character.toLowerCase(name.charAt(right));
            if (leftchar!=rightchar) {
                isPalindrom=false;
                 break;
            }
            left++;
            right--;
        }
       }if (isPalindrom) {
        System.out.println("is palindrome");
       }else{
        System.out.println("not palindrome");
       }
        
      
        }
}


