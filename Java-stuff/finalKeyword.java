class Calc{ //Final class stops inheritance 
    public final void show(){ //final method stops method overriding 
        System.out.println("Calc show");
    }
    public int add(int a, int b){
        return a+b;
    }
}

// class AdvCalc extends Calc{ //error because of final 

// }

public class finalKeyword {
    public static void main(String a[]){
        final int num = 8; //Final keyword means the var is constant and can't be changed
        //num = 9;
        System.out.println("num");

        Calc obj = new Calc();
        obj.show();
        obj.add(5,9);
    }
    
}
