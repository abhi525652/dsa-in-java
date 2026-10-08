public class A13PrintPatternApproach {
    public static void print(int n){ // prints n starts in a line
        if(n<=0) return ;
        System.out.print("*"+" ");
        print(n-1);
    }
    public static void f(int n,int totalRow){
        if(n<=0) return;
        print(totalRow); //call this function to print pattern for the given row
        //at this point we have n starts printed in a line
        //let's go to a new line
        System.out.println();

        f(n-1, totalRow);

    }
    public static void main(String[] args) {
        f(5, 5);
    }
}
