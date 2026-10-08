public class A14PrintPatternApproach2 {
    public static void f(int row,int col,int n){
        if (row>n) return ; // all row are printed
        if (col>n) {
            System.out.println(); // new line before moving to next row
            f(row+1, 1, n); //all column of give row are done, move to next row
            return ;
        } 
        System.out.print("*"+ " ");
        f(row, col+1, n);
    }
    public static void main(String[] args) {
        f(1, 1, 5);
    }
}
