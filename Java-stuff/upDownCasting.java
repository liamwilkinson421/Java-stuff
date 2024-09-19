class A{
    public void show1(){
        System.out.println("Show A");
    }
}
class B extends A{
    public void show2(){
        System.out.println("Show B");
    }
}

public class upDownCasting {
    public static void main(String a[]){
        double d = 4.5;
        int i = (int) d; //converting double to int, typecasting, 4.5 -> 4, primitive downcast
        A obj = (A) new B(); //typecasting to parent class, called upcasting, reference of A with object of B, do not usually need to mention (A)
        obj.show1();
        
        //B obj1 = obj; //will not work because obj is referencing an A object
        B obj1 = (B) obj; //downcasting to child reference so it references a B object and wil work
        obj1.show2();

        System.out.println(i);
    }
    
}
