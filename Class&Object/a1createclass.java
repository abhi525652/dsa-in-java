
class calculation{
    public int sum(){
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println("hey people");
        return c;
       
    }
}
public class a1createclass {
    public static void main(String[] args) {
        calculation cal=new calculation();
       int result= cal.sum();
       System.out.println(result);
    }
}
