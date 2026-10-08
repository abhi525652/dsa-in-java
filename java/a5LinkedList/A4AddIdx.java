public class A4AddIdx {
   static  class node{
        int data;
        node next;
         node(int data){
            this.data=data;
            this.next=null;
        }
    }
   static  node head;
    //add in last
    public static  void addLast(int data){
        node newNode=new node(data);
        if (head==null) {
            head=newNode;
            return;
        }
        node temp=head;
        while (temp.next!=null) {
            temp=temp.next;

        }
        temp.next=newNode;
    }

    
    //add num on index
    public static void addAt(int data,int idx){
        node newNode=new node(data);

        if (idx<0) {
            return;
        }
        if (idx==0) {
            newNode.next=head;
            head=newNode;
            return;
        }
       node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
            
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public static void printlist(){
        node temp=head;
        System.out.println("===================================");
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
        System.out.println("================================");
    }
    public static void main(String[] args) {
        addLast(10);
        addLast(20);
        addLast(30);
        addLast(40);
        addLast(50);
        addAt(90, 2);
        printlist();
    }
}
