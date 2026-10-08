
import java.util.*;

public class StringToArr {
    public static void main(String[] args) {
        String str="123";
        System.out.println(Integer.parseInt(str)); //String to Int


        int num=123;
        System.out.println(String.valueOf(num));// Int to String


        char[] arr=str.toCharArray();
        System.out.println(Arrays.toString(arr));// "123"---[1,2,3]
    }
}
