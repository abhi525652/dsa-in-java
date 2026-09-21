class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}



public class A1createNode {
    public static void main(String[] args) {
        node n1=new node(10);
        node n2=new node(20);
        node n3=new node(30);

        n1.next=n2;
        n2.next=n3;

        node head=n1;
        node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
           temp= temp.next;
        }
        System.out.println("Null");
    }
}
