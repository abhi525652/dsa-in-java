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
 {  this();                                       //we put here n in super(n) for the parametric children method
    System.out.println("Student in student");
 }
}

public class Z2this {
  public static void main(String[] args) {
     student obj=new student(6);              // used for non parametric method
        
  }  
}
