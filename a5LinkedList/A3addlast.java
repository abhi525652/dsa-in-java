

public class A3addlast {
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }

    //add new node in last
    static node head;
    static void addlast(int data){
        node newnode=new node(data);
        if (head==null) {
            head=newnode;
            return ;
        }
        node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
           
        }
         temp.next=newnode;
    }

    //print
    static void printList(){
        System.out.println("=======================");
        node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
        System.out.println("===========================");
    }

   public static void main(String[] args) {
    addlast(10);
    addlast(20);
    addlast(30);
    addlast(40);
    addlast(50);
    addlast(60);
    printList();
   } 
}
