@FunctionalInterface //Specify that an interface has only ONE method for use with lambda expressions
interface A{
    void show();
}
class B implements A{
    public void show(){

    }
}
public class functionalInterface {
    public static void main(String a[]){
        A obj = new A(){
            public void show(){

            }
        };
        obj.show();
    }
}
