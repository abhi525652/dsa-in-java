import java.util.LinkedList;

public class A1 {
    


    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
        list.add(10); // Adds to the end of the list
        list.add(20);
        list.addFirst(5); // Adds to the very beginning
        
        System.out.println(list); // Output: [5, 10, 20]
    }
}


