

public class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
    public static void main(String[] args) {
        node newnode=new node(10);
        newnode.next=new node(20);
        newnode.next.next=new node(30);
        node current=newnode;
        while (current!=null) {
            System.out.print(current.data+ " ");
            current=current.next;
        }
        System.out.println("Null");
      
    }
}
