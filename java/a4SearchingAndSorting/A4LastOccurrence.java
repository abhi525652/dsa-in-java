public class A4LastOccurrence {
        public static void main(String[] args) {
        int[] arr={3,2,6,9,2,5,7,2};
        int target=2;
        for(int i=arr.length-1;i>=0;i--){
            if (arr[i]==target) {
                System.out.println(i);
                break;
            }
        }
    }
}
