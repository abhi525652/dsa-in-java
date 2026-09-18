class bank{
    String name;
    int age;
    void setage(int age){
         this.age=age;
    }
    void setname(String name){
        this.name=name;
    }
    public String getname(){
       return name;
    }
    public int getage(){
       return age;
    }

}


public class A3thisKeyword {
    public static void main(String[] args) {
        bank s1=new bank();
        s1.setage(12);
        s1.setname("Abhishek");
        System.out.println(s1.getage()+" "+ s1.getname());
    }
}
