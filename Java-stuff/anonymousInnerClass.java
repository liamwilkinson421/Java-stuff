// class A{
//     public void show(){
//         System.out.println("In A show");
//     }
// }

abstract class A{
    public abstract void show();
    public abstract void config();
}

class B extends A{
    public void show(){
        System.out.println("B show");
    }
    public void config(){
        System.out.println("B show");
    } 
}

public class anonymousInnerClass {
    public static void main(String a[]){
        // A obj = new A(){ //innerclass as anonymous inner class defined at object creation time, method show() overridden
        //     public void show(){
        //         System.out.println("In new show");
        //     }
        // };
        // obj.show();

        A obj = new A(){
            public void show(){
                System.out.println("In Anon Inner Class");
            }
            public void config(){
                System.out.println("In config");
            }
        };
        obj.show();

    }
}
