class A{
    
    public void news(){
            System.out.println("New Car");
        }
    class B{
       
       public void flying(){
        System.out.println("Flying car");
       }
    }
}

public class A2ClassBelonging {
    public static void main(String[] args) {
        A obj = new A();
        obj.news();
        A.B obj1=obj.new B();
        obj1.flying();
    }
}
