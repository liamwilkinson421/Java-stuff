class A{ //innerClass -> a class inside of a class

    int age;
    public void show(){
        System.out.println("Show");
    }

    static class B{
        public void config(){
            System.out.println("Config");
        }
    }
}

public class innerClass {
    public static void main(String a[]){
        A obj = new A();
        obj.show();

        //A.B obj1 = obj.new B();  //to call B you need object of A
        A.B obj1 = new A.B(); //Static reference of inner class, will not work for non-static class
        obj1.config();

    }
}
