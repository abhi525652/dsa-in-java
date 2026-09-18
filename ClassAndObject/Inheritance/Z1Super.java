class children
{
    public children()
    {   super();
         System.out.println("In children");
    }
    public children(int n)
    {   super();
        System.out.println("children in children");
    }
}



class student extends children
{
    public student()
   {super(5);                                        // all super() keyword are default
    System.out.println("In student");
   }

 public student(int n)
 {  super();                                       //we put here n in super(n) for the parametric children method
    System.out.println("Student in student");
 }
}



public class Z1Super {
    public static void main(String[] args)
    {
        student obj=new student();              // used for non parametric method
        student obj1=new student(4);

    }
}
