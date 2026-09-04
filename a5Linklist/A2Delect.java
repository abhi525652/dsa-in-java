import java.util.LinkedList;

public class A2Delect {
    public static void main(String[] args) {
        LinkedList<Integer>List=new LinkedList<>();
        List.add(10);
        List.add(20);
        List.add(30);
        List.add(40);
        List.add(50);
        System.out.println(List +" ");
        List.remove(4);
        System.out.println(List+" ");
    }
}
