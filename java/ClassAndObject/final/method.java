 class cal{
   final public void show(){
        System.out.println("In show");
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
}

class advcal extends cal{    //once it final we can't used method
// public void show(){              
//     System.out.println("In advcal");
// }
 }

public class method {
    public static void main(String[] args) {
        advcal obj=new advcal();
        obj.add(4, 6);
        obj.show();
    }
}
