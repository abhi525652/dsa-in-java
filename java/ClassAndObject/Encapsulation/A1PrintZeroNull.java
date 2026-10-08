class bank{

    private String name ;
    private int age;

    public String getname(){
        return name;
    }

    public int getage(){
        return age;
    }
}

public class A1PrintZeroNull {
    public static void main(String[] args) {
        bank obj=new bank();
        
        System.out.println(obj.getage());
        System.out.println(obj.getname());
    }
}
