public class A10NonRepeatingChar {
  
      public static void main(String[] args) {
        String name="programmer";
       
        for(int i=0;i<name.length();i++){
            char b=name.charAt(i);
             int count=0;
          for(int j=0;j<name.length();j++){
            if (b==name.charAt(j)) {
                count++;
                }
          }
                if (count==1) {
                    System.out.println(b);
                    break;
                }
            }
            }
            
        }
    



