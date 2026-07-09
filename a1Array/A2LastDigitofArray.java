
public class A2LastDigitofArray {
    public static void main(String[] args) {
        int[] arr={23,45,67,78,89,123};
        int lastDigit= arr[arr.length-1];
        int b=lastDigit%10;
        System.out.println(b);
    }
}
