class calc{
    public int add(int a,int b){
        return a+b;
    }
}
class adv extends calc{
    public int add(int a,int b){
        return a+b+1;
    }
}
public class Z3Overriding {
    public static void main(String[] args) {
        adv obj=new adv();
        int r1=obj.add(5, 4);
        System.out.println(r1);
    }
}
