class car{
    public int model(int num1, int num2){
        return num1+num2;
    }
    public int model(int num1,int num2,int num3){
        return num1+num2+num3;
    }
     public double model(double num1,int num2,int num3){
        return num1+num2+num3;
    }
}

public class a3methodOverload {
    public static void main(String[] args) {
        car obj=new car();
        double sum =obj.model(3.56, 6,7);
    
        System.out.println(sum);
    }
}
