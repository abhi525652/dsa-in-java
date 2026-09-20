public class A3FindLength {
    int data;
    A3FindLength next;
    A3FindLength(int data){
        this.data=data;
        this.next=null;

    }
    A3FindLength(){
        this(0);
    }
    public static void main(String[] args) {
        A3FindLength obj1=new A3FindLength(10);
        A3FindLength obj2=new A3FindLength(20);
        A3FindLength obj3=new A3FindLength(30);
        
        
        System.out.println(obj1.data+" "+obj2.data+" "+obj3.data);
    }
}
