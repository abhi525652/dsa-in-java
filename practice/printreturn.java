import java.util.*;
public class printreturn {
    public static void print(int[] arr){
        for(int num:arr){
            System.out.print(num+ " ");
        }
      
        System.out.println(Arrays.toString(arr));
    }
 
    public static void main(String[] args) {
        int[] arr={2,3,4,5,5,};
        print(arr);
       
       
    }
}
