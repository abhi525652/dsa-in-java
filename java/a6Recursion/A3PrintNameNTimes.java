

public class A3PrintNameNTimes {
    public static void Print(int n){
        if (n==1) {
            System.out.print("Abhishek"+" ");
            return;
        }
        Print(n-1);
        System.out.print("Abhishek"+" ");
    }
   public static void main(String[] args) {
    int n=5;
    Print(n);
   } 
}
