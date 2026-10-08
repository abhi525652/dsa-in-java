

public class A1FindElement {
    public static void main(String[] args) {
        int[] arr={3,6,9,2,5,7};
        int target=2;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==target) {
                System.out.println(i);
            }
        }
    }
}
