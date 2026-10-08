public class A6Count {
     public static void main(String[] args) {
       String st ="Hello, Body How Are You ?";
       int uppercase=0;
       int lowercase=0;
       int chara=0;
       for(int i=0;i<st.length();i++){
        char ch=st.charAt(i);
        if (Character.isUpperCase(ch)) {
            uppercase++;
        }else if (Character.isLowerCase(ch)) {
            lowercase++;
        }else{
            chara++;
        }
         
       }System.out.println(uppercase);
       System.out.println(lowercase);
       System.out.println(chara);
}
}