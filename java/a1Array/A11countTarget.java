public class A11countTarget {
     public static void main(String[] args) {
      int[] arr = {2, 5, 2, 7, 2, 9, 5};
      int target = 2;
      int num=0;
       for(int i=0;i<arr.length;i++){
        if (arr[i]==target) {
            num++;
        }
       }
       System.out.println("the count of target = "+ num);

    }
}
