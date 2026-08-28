

abstract class Car{
    public abstract void driving();
    public abstract void flying();
    

    public void playmusic(){
        System.out.println("Play music");
    }

    
}
abstract class WagonR extends Car{
public void driving(){
    System.out.println("Driving a car");
}
}
class UpdatedWagonR extends WagonR{             //here is not abstract class so it is called concrete class
    public void flying(){
        System.out.println("flying car");
    }
}

public class A1 {
    public static void main(String[] args) {
        Car obj = new UpdatedWagonR();
        obj.driving();
        obj.playmusic();
        obj.flying();
    }
}
