public class A6Ascending {
    public static void printAcending(int n){
        if(n==0) return ;
        printAcending(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        printAcending(10);
    }
}
