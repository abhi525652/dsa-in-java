class add{
public int sum(int num1, int num2){
int c=num1+num2;
return c;
}
}

public class a2pushvalue {
    public static void main(String[] args) {
        int num1=5;
        int num2=2;
        add cal=new add();
       int result = cal.sum(num1, num2);
        System.out.println(result);
    }
}
