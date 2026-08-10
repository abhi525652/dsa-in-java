
class car{
public void tire() {
    System.out.println("two wheeler");
}
public String model(int num){
    if (num>=5) {
       
        return "tata";
    }
   
   return "nothing";
}
}
public class a3Twoclass {
    public static void main(String[] args) {
        car cr=new car();
        cr.tire();
       String ram= cr.model(2);
       System.out.println(ram);
    }
}
