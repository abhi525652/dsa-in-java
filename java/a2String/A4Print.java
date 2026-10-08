public class A4Print{
    public static void main(String[] args) {
       String st ="hello, body how are you ?";
       for(int i=0;i<st.length();i++){
         System.out.print(st.charAt(i)+ " ");
       }
    System.out.println( st.length() + " character in strings ");
    //without length();
    int count=0;
     for(int i=0;i<st.length();i++){
        count++;
     }
     System.out.println(count);
    }
}