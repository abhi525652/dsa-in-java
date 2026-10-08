public class A5DelectFirst {
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
static node head;
    static void addlast(int data){
        node newnode=new node(data);
        if (head==null) {
            head=newnode;
            return;
        }
        node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newnode;
    }
    static void printlist(){
        System.out.println("=============================");
        node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
        System.out.println("=========================");
    }
    
    static void delectfirst(){
        if (head==null) {
            System.out.println("The list is already empty");
            return ;
        }
        head=head.next;
    }
    public static void main(String[] args) {
        addlast(10);
        addlast(20);
        addlast(30);
        addlast(40);
        addlast(50);
        printlist();
        delectfirst();
        printlist();
    }
}
