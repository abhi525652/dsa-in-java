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
   {super();                                        // all super() keyword are default
    System.out.println("In student");
   }

 public student(int n)
 {  super(n);                                       //we put here n for the parametric children method
    System.out.println("Student in student");
 }
}



public class Z1Super {
    public static void main(String[] args)
    {
        student obj=new student(4);

    }
}
