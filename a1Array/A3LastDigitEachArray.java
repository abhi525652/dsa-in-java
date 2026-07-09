public class A3LastDigitEachArray {
       public static void main(String[] args) {
        int[] arr={23,45,67,78,89,123};
        for(int i=0; i<=arr.length;i++){
        int lastDigit= arr[i];
        int b=lastDigit%10;
        System.out.print( b + " ");
        }
       
    }
}
