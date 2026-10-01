public class A9ArrayRecu {
    public static void f(int[] arr, int idx){
if(idx>=arr.length) return ; // everything is printed , don't do anything
    System.out.print(arr[idx]+ " "); // self work
         f(arr, idx+1);
    }
    public static void main(String[] args) {
        int [] arr={3,5,7,2,3,4,6};
        f(arr, 0);  // we want print everything 0--n-1
    }
}
