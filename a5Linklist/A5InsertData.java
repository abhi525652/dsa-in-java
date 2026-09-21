public class A5InsertData {
    int data;
    A5InsertData next;
    A5InsertData(int data){
        this.data=data;
        this.next=null;

    }

    static A5InsertData head;
    static void addlast(int data){
        A5InsertData newnode=new A5InsertData(data);
         
        if (head==null) {
            head=newnode;
            return;
        }
        A5InsertData temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
      
    }
    static void addAtIndex(int index,int data){
        A5InsertData newNode= new A5InsertData(data);
        //add at index 0;
        if (index==0) {
            newNode.next=head;
            head=newNode;
            return ;
        }
        A5InsertData temp=head;

        //Go to node before the index
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
       newNode.next=temp.next;
       temp.next=newNode;
        
    }
     static void printList() {
        A5InsertData temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
      public static void main(String[] args) {

        addlast(10);
        addlast(20);
        addlast(30);
        addlast(40);

        addAtIndex(2, 99);

        printList();
    }
}
