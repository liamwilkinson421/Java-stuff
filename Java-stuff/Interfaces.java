// class -> class = extends
// class -> interface = implements
// interface -> interface = extends
// Normal Interface 2 or more methods
// Functional Interface (SAM) only ONE method (SINGLE ABSTRACT METHOD)
// Marker Interface, an interface with no methods
// All methods are public and abstract and can only define methods in interface

interface A{  //interface is NOT a class, every method is public abstract by default

    int age=20; // all variable inside interface are final and static
    String area="Wigan";

    void show();
    void config();
}

class B implements A { //implements interface keyword instead of extends, interface methods must be defined
    public void show(){
        System.out.println("Show");
    }
    public void config(){
        System.out.println("Config");
    }
}

public class Interfaces {
    public static void main(String a[]){
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        //A.area = "Manchester"; // cannot change value as variables are final in interface 

        System.out.println(A.area);
        //obj = new A(); Cannot instantiate interface
    }
}
