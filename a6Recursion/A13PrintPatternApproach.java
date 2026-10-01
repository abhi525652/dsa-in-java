public class A13PrintPatternApproach {
    public static void print(int n){
        if(n<=0) return ;
        System.out.print("*"+" ");
        print(n-1);
    }
    public static void f(int n,int totalRow){
        if(n<=0) return;
        print(totalRow);
        System.out.println();
        f(n-1, totalRow);

    }
    public static void main(String[] args) {
        f(5, 5);
    }
}
