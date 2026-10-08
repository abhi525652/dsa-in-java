public class A16SubArray {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,7,8};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                System.out.print("[");
                for(int k=i;k<=j;k++){
                    System.out.print(" "+arr[k]+" ");
                }
                System.out.println("]");
            }
        }
    }
}
