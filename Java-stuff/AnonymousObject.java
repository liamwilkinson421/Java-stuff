class A{
    public A(){
        System.out.println("object created");
    }
    public void show(){
        System.out.println("Show");
    }
}

public class AnonymousObject {
    public static void main(String a[]){

        // int marks;
        // marks = 99;

        // A obj;
        // obj = new A();
        // obj.show();

        new A().show(); //Anonymous object has no name
    }
}
