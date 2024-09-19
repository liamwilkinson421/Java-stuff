class A{
    public void show(){
        System.out.println("A Show");
    }
    public void config(){
        System.out.println("In A Config");
    }
}

class Calc{
    public int add(int n1, int n2){
        return n1+n2;
    }
}

class AdvCalc extends Calc{
    public int add(int n1, int n2){
        return n1+n2+1;
    }
}

class B extends A{
    public void show(){
        System.out.println("In B Show");
    }
}

public class MethodOverriding {
    public static void main(String a[]){
        B obj = new B();
        obj.show();
        obj.config();

        AdvCalc obj1 = new AdvCalc();
        int r1 = obj1.add(5, 6);
        System.out.println(r1);
    }
}
