public class A12SecondLarget {
     public static void main(String[] args) {
     int[] arr = {12, 45, 7,73, 89, 34, 89};
     int largest=arr[1];
     int secondLargest=0;
     
       for(int i=0;i<arr.length;i++){
      if (arr[i]>largest) {
       secondLargest=largest;
       largest=arr[i];
      }
       }System.out.println(secondLargest);

    }
}
