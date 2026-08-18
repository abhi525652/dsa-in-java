class student{
    String name;
    int age;
    student()
    {
     System.out.println("in constructor"); //there is no return type(int, string , boolean, even void) , automatically called.
    }



    
    void display(){      //there is method.  there is diff b/t method(need return type) and contructor(no need, same name of class)
    System.out.println(name); // not used anywhere. this is example of understand
    }
}

public class A1 {
    public static void main(String[] args) {
        student s1=new student();  // we create 2 object. they called constuctor twice.
        student s2=new student();
       
    }
}
