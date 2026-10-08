

public class A2PrintAcenNo {
    public static void PrintAcen(int n){
        if (n==1) {
            System.out.print(n+" ");
            return;
        }
        PrintAcen(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=10;
        PrintAcen(n);

    }
}
