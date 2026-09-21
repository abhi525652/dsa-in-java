public class A3AddNode {
    int data;
    A3AddNode next;
    A3AddNode(int data){
        this.data=data;
        this.next=null;

    }
    A3AddNode(){
        this(0);
    }
    public static void main(String[] args) {
        A3AddNode obj1=new A3AddNode(10);
        A3AddNode obj2=new A3AddNode(20);
        A3AddNode obj3=new A3AddNode(30);
        System.out.println(obj1.data+" "+obj2.data+" "+obj3.data);
    }
}
