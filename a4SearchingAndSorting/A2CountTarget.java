public class A2CountTarget {
    public static void main(String[] args) {
        int[] arr={3,2,6,9,2,5,7,2};
        int target=2;
        int count =0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==target) {
                count++;
            }
        }System.out.println(count);
    }
}
