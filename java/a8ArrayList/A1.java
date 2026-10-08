
import java.util.ArrayList;

public class A1 {
   public static void main(String[] args) {
    ArrayList<Integer> array= new ArrayList<>();
    array.add(5);
    array.add(10);
    array.add(20);
    array.add(12);
    array.add(13);
    array.add(14);
    System.out.println("=====================================");
    System.out.println(array);              // complete array
    System.out.println("first element = "+array.getFirst());              // first object

     System.out.println("Get the element by Index = "+array.get(2)); // print as index array

     System.out.println("Last element = "+array.getLast());  // last object
     System.out.println("Reverse = "+array.reversed()); // reverse the array

    array.remove(0);
    System.out.println("Remove the first element "+ array);

   
    System.out.println("===========================================");
    ArrayList<String> Language= new ArrayList<>();
    Language.add("apple");
    Language.add("mango");
    Language.add("papaya");
    System.out.println(Language);

    System.out.println(Language.size());  // size

    String str=Language.set(1, "banana");   // change the value 

    System.out.println(Language);
    System.out.println("============================================");
   } 
}
