

public class A2addFirst {

static class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
       static  Node head;

    static void addFirst(int data){
       Node Newnode= new Node(data);
       Newnode.next=head;
       head=Newnode;

    }

    static void printList(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
       addFirst(10);
       addFirst(20);
       addFirst(30);
       addFirst(40);
       printList();
    }
}
