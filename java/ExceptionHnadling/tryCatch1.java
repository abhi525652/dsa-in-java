public class tryCatch1 {
    public static void main(String[] args) {
        int a=3;
        int b=0;
        try{
            divide(a, b);
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("code is completed");
        }
    }

    static int divide(int a,int b) throws ArithmeticException{
        if (b==0) {
            throw new ArithmeticException("Do not divide by zero");
        }
        return a/b;
    }
}
