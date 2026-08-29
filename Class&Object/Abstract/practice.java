class A{
public void show(){  // we have to write this line without this line

}
}

public class practice {
  public static void main(String[] args) {
    A obj =new A(){
        public void show(){
            System.out.println("hello");
        }
    };
    obj.show(); // this line wrong they do not call any one
  }  
}
