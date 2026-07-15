public class A15CountChar {
     public static void main(String[] args) {
        String name="apples";
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            int count=0;

            for(int j=0;j<name.length();j++){
                if (ch==name.charAt(j)) {
                    count++;
                }
            }
            boolean printed=false;
            for(int k=0;k<i;k++){
                if (ch==name.charAt(k)) {
                    printed=true;
                    break;
                }
            }
            if (!printed) {
                System.out.println(ch+ " -"+ count);
           }
                                                               
           
           // System.out.println(ch+ " " +count); this is used when you want print each char
        }
    }
}
