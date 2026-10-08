

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
//add the node
    static void addFirst(int data){
       Node Newnode= new Node(data);
       Newnode.next=head;
       head=Newnode;

    }
    
  static   int count=0;
 //print list
    static void printList(){
        System.out.println("=========================================");
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            count++;
            temp=temp.next;
        }
        System.out.println("null");
        System.out.println("======================================");
        System.out.println("The node present = "+ count);
    }
    public static void main(String[] args) {
       addFirst(10);
       addFirst(20);
       addFirst(30);
       addFirst(40);
       printList();
    }
}
