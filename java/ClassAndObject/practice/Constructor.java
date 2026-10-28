public class Constructor {
    private String name;
   Constructor(){
   System.out.println("Abhishek Singh");
   }

   Constructor(String lang){
   System.out.println( lang);
   }
    public static void main(String[] args) {
   Constructor obj=new Constructor();
   Constructor obj1= new Constructor("Abhishek");
   
    }
}
