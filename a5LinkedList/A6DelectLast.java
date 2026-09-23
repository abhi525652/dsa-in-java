public class A6DelectLast {
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
    System.out.println("==========================");
    node temp=head;
    while (temp!=null) {
        System.out.print(temp.data+"->");
         temp=temp.next;
    }
    System.out.println("Null");
    System.out.println("================================");
   
}
//delete last node
static void delectlast(){
    if (head==null) {
        System.out.println("List is empty. nothing to delect");
        return;
    }
    if (head.next==null) {
        head=null;
    return ;
    }
    node temp=head;
    while (temp.next.next!=null) {
        temp=temp.next;
    }
    temp.next=null;

}
public static void main(String[] args) {
    addlast(10);
      addlast(20);
        addlast(30);
        addlast(40);
        addlast(50);
    printlist();
    delectlast();
    printlist();
    delectlast();
    printlist();
}
}