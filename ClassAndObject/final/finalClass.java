final class cal{
    public void show(){
        System.out.println("In show");
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
}

// class advcal extends cal{    //once it final we can't extends with other
// public void print(){
//     System.out.println("In advcal");
// }
// }
public class finalClass{
    public static void main(String[] args) {
        cal obj=new cal();
        obj.add(3, 5);
    }
}
