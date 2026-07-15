public class A16PrintDublicate {
     public static void main(String[] args) {
        String name="ssningh";
       for(int i=0;i<name.length();i++){
        char ch=name.charAt(i);
        int count=0;
        for(int j=0;j<name.length();j++){
            if (ch==name.charAt(j)) {
                count++;
            }
        }boolean printed=false;
        for(int k=0;k<i;k++){
            if (name.charAt(k)==ch) {
                 printed=true;
                 break;
            }
        }
        if (count>1&&!printed) {
            System.out.println(ch+ " "+ count);
        }
      
       }
    }
}
