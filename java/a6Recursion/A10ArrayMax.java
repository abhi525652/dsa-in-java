public class A10ArrayMax {
    public static int printMax(int[] arr,int idx){
        if(idx==arr.length-1) return arr[idx] ;
        return Math.max(arr[idx], printMax(arr, idx+1));
    }
    public static void main(String[] args) {
        int[] arr={2,8,3,5,10,2,4,6,7,1};
        System.out.println( printMax(arr, 0));
       
    }
}
