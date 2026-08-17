class add{
public int sum(int num1, int num2){
return num1+num2 ;
}
}

public class a2pushvalue {
    public static void main(String[] args) {
        int num1=5;
        int num2=2;
       add result =new add();
       System.out.println(result.sum(num1, num2));
    }
}
