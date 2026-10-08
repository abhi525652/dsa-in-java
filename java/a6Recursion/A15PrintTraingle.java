public class A15PrintTraingle {
    public static void f(int row,int col,int n){
        if(row>n) return ;
        if (col>row) {
            System.out.println();
            f(row+1, 1, n);
            return ;
        }
        System.out.print("*"+" ");
        f(row, col+1, n);
       
    }
    public static void printdownWardTriangle(int row,int col,int n){
        if(row>n) return;  //all row are printed
        if (col>n-row+1) { // everything is printed  curr row
            System.out.println(); //new line is printed in curr row
           printdownWardTriangle(row+1, 1, n); // all col of given row are done, move to next row
           return ;   // return because work done
        }
        System.out.print("*"+" ");
        printdownWardTriangle(row, col+1, n);  //complete col
    }

    public static void main(String[] args) {
        f(1, 1, 5);
        System.out.println("=======================================================");
        System.out.println("=======================================================");
        printdownWardTriangle(1, 1, 5);
    }
}
// * * * * *//row=1 col=5
// * * * * // row=2 col=4
// * * *  //row=3 col=3        formula = col-row + 1 
// * *   // row=4 col=2
// *    // row=5 col=1
