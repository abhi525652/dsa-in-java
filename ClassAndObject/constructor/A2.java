class student{
    String name;
    int age;
    student(){
        this.age=12;
        this.name="abhishek";
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
}

public class A2 {
    public static void main(String[] args) {
        student s1=new student();
        System.out.println(s1.getname()+" : "+s1.getage());
    }
}
