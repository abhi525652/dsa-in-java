class Car{
    public void driving(){
        System.out.println("Driving my own car");
    }

    public void playmusic(){
        System.out.println("Play music");
    }
}

public class A1 {
    public static void main(String[] args) {
        Car obj= new Car();
        obj.driving();
        obj.playmusic();
    }
}
