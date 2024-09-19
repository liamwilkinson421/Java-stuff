class A extends Object{  //Every class extends object class 
    public A(){
        super();
        System.out.println("A");
    }
    public A(int n){
        super();
        System.out.println("In A N");
    }

}

class B extends A{
    public B(){
        super(); //Every constructor's first statement is super, it means to call the constructor of a super class (the default)
        System.out.println("B");
    }
    public B(int n){
        //super(n); //explicitly mention super to call parameterised constructor
        this(); //executes constructor for same class
        System.out.println("In B N");
    }
}



public class thisAndSuper {
    public static void main(String a[]){
        B obj = new B(5); //Call B - since B extends A, super is always called, so call A Constructor, then call B constructor with this(), then call B parameterised constructor
    }
}
