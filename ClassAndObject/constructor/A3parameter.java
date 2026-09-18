class student{
    String name;
    int age;

     student(){             //default
        this.name="Abhishek";
        this.age=12;
     }

     student(String name,int age){ //parameter
        this.name=name;
        this.age=age;
     }
     public String setname(){
        return name;
     }
     public int setage(){
        return age;
     }
}

public class A3parameter {
    public static void main(String[] args) {
        student s1=new student();
        student s2=new student("sunil", 12);
       System.out.println(s1.setage()+" "+s1.setname());
       System.out.println(s2.setage()+" "+s2.setname());
    }
}
