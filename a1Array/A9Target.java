public class A9Target {
     public static void main(String[] args) {
       int[] arr={28,64,56,79,29,81};
       int target=81;
       for(int i=0;i<arr.length;i++){
        if (arr[i]==target) {
         System.out.println("the index = " + i);
         break;
        }
       
       }

    }
}
