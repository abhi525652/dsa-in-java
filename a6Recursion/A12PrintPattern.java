public class A12PrintPattern {
    public  static void PrintPatternGivenRow(int n){
        for(int i=0;i<=n;i++){
            System.out.print("*"+" ");
        }
        System.out.println();
    }
    public static void f(int n,int totalStars){
        if(n==0) return ;
      PrintPatternGivenRow(totalStars);
      f(n-1, totalStars);
    }
    public static void main(String[] args) {
        f(5, 5);
    }
}
