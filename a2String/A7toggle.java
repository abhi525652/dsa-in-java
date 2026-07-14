public class A7toggle {
   
     public static void main(String[] args) {
       String st ="AbHiSHek234";
        String result="";
       for(int i=0;i<st.length();i++){
        char ch=st.charAt(i);
        if (ch>='A'&& ch<='Z') {
        result=result+(char)(ch+32);
       }else if (ch>='a'&&ch<='z') {
        result=result+(char)(ch-32);
       }else{
        result=result+ch;
       }
         
       }
       System.out.println(result);
}
}

