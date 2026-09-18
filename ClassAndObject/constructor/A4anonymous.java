class student{
student(){
    System.out.println("object created");
}

public void object(){
    System.out.println("object is here");
}
}

public class A4anonymous {
    public static void main(String[] args) {
        new student();      //anonymous
        new student().object();;      //anonymous
    }
}
