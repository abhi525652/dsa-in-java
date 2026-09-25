public class A4factorial {
    public static long f(int n){
        //base case
        if (n==1 || n==0) {
            return 1;
        } 
        return n*f(n-1);
    }
    public static void main(String[] args) {
       System.out.println(f(5 )); 
    }
}
