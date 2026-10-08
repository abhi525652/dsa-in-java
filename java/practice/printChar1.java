import java.util.Arrays;

public class printChar1 {
    public static void main(String[] args) {
        String str="Abhishek singh";
        String[] arr=str.split(" ");
        System.out.println("===========================================");
        System.out.println(Arrays.toString(arr));
        System.out.println("===========================================");
         for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
    }
    System.out.println();
        System.out.println("==========================================");
        
       
        for(int i=0;i<str.length();i++){
             System.out.print(str.charAt(i)+" ");
    }
        }
       
}
