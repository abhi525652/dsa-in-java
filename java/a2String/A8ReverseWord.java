

public class A8ReverseWord {
      public static void main(String[] args) {
        String name="abhishek singh is the student of tit";
        String[] arr=name.split(" ");
        for(int i=arr.length-1;i>=0;i--){
        System.out.print(arr[i] + " ");
       }
    }  
}
