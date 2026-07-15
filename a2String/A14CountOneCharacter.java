public class A14CountOneCharacter {
     public static void main(String[] args) {
        String name="Abhishek Singh Is The sTUDENT of tIt";
        char target='S';
        int count=0;
        for(int i=0;i<name.length();i++){
            char n=name.charAt(i);
           if(n==target){
            count ++;
           }
        } System.out.println(count);
       
    }  
}
