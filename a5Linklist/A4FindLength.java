public class A4FindLength {
    int data;
    A4FindLength next;
    A4FindLength(int data){
        this.data=data;
        this.next=null;
    }
    
    public static void main(String[] args) {
        A4FindLength obj=new A4FindLength(10);
        A4FindLength obj1=new A4FindLength(20);
        A4FindLength obj2=new A4FindLength(30);
        A4FindLength obj3=new A4FindLength(40);
        A4FindLength obj4=new A4FindLength(50);
       
       // 2. Manually linking them
        obj.next=obj1;
        obj1.next=obj2;
        obj2.next=obj3;
        obj3.next=obj4;
      
       // 3. Set up the tracking pointer and the length counter
        A4FindLength current=obj;    // Start at the head (node1)
       int count=0;                    // Start counting from 0
      
      
       while (current!=null) {       // 4. Loop until current hits null
        count++;
        current=current.next;        // Hop to the next node
       }
       System.out.println("The length of Linkedlist = "+count);
    }
}
