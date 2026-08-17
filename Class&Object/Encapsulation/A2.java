class bank{
    private String name;
    private int age;

    public String getname(){
        return name;
    }

    public void setage(int a){
        age=a;
    }

    public void setname(String b){
        name=b;
    }

    public int getage(){
        return age;
    }
}



public class A2 {
    public static void main(String[] args) {
        bank obj=new bank();
        obj.setage(49);
        obj.setname("Abhishek singh");
        System.out.println(obj.getage()+" "+ obj.getname());
    }
}
