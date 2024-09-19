class A{
    public void show(){
        System.out.println("Show A");
    }
}

class B extends A{
    public void show(){
        System.out.println("Show B");
    }
}

// class Computer{

// }

// class Laptop extends Computer{

// }


public class dynamicMethodDispatch {
    public static void main(String A[]){
        A obj = new A(); //Initialise object as type A
        obj.show(); //Call A Show
        obj = new B(); //Reassign obj as child class, B
        obj.show(); //Call B Show
        //A obj = new B(); // = new B object with Parent class type, will call B.show();
        //Computer lap = new Laptop(); Type =  parent class (Computer), object = child type (Laptop)
    }
}
