abstract class Car{ //has to be abstract class
    public abstract void drive(); //declared method, not defined, define within child class

    public void playMusic(){
        System.out.println("Play music");
    }

}

class Wagon extends Car{ //Concrete class not abstract
    public void drive(){
        System.out.println("Drive");
    }
}

public class abstractKeyword {
    public static void main(String a[]){
        //Car obj = new Car(); //cannot create object of abstract class 
        Car obj = new Wagon();
        obj.drive();
        obj.playMusic();
    }
}
