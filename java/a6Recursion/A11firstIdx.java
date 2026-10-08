public class A11firstIdx {
    public static int f(int[] arr,int idx, int x){
        //base case
        if(idx==arr.length) return  -1;

        //self work
        return (arr[idx]==x) ? idx :f(arr, idx+1, x);
    }
    public static void main(String[] args) {
        int[] arr= {1,5,6,2,3,6,8};
        int x=6;
        System.out.println( f(arr, 0, x));
    }
}
