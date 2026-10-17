

public class TryCatch {
    public static void main(String[] args) {
        int i=0;
        int j=0;
         
        try{
            j=18/i;   // If we change the value of "i" into positive interger,  it will skip the try and catch
        }
        catch(Exception e){
            System.out.println("something went wrong. " +  e);
        }

        System.out.println(j);   // j is mentioned as "0"
        System.out.println("bye");
    }
}
