public class A12PrintPattern {
    public  static void PrintPatternGivenRow(int totalStars){
        for(int i=0;i<=totalStars;i++){ // print total stars in a line
            System.out.print("*"+" ");
        }
        System.out.println();
    }
    public static void f(int n,int totalStars){
        if(n==0) return ;
      PrintPatternGivenRow(totalStars);
      f(n-1, totalStars);  // call the function for the next line 
    }
    public static void main(String[] args) {
        f(5, 5);
    }
}
