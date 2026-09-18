class A{
    
    public void show(){
    
             System.out.println("In the show");
        
       
    }
}
class B extends A{
    public void show( int age){
       
             System.out.println("In the show B");
        
       
    }
}

public class A3AnonamousInnerClass {
    public static void main(String[] args) {
        A obj=new B()
        {
            public void show(){
                System.out.println("In New Show");
            }
        };
        obj.show();
    }
    
}
