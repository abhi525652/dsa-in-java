public class A17RemoveDublicate {
     public static void main(String[] args) {
        String name="abhishek singh";
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
          boolean printed=true;
          for(int j=0;j<i;j++){
            if (name.charAt(j)==ch) {
              printed=false;
            }
          }
          if (printed) {
            System.out.print(ch);
          }
        }
    }
}
