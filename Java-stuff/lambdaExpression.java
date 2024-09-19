@FunctionalInterface //Specify that an interface has only ONE method for use with lambda expressions
interface A{
    int maths(int i, int j);
}

public class lambdaExpression { //ONLY works with functional interface
    public static void main(String a[]){

        // A obj = new A() {
        //     public int add(int i, int j){
        //         return i+j;
        //     }
        // };

        // int result = obj.add(5,4);
        // System.out.println(result);

        A obj = (i, j) -> i-j; //Lambda syntax for adding = call object, variables in bracket -> to functional code, i+j adds them, return is implicit
        int result = obj.maths(5,4);
        System.out.println(result);
        
        // A obj = i -> System.out.println("In show"); //Interface with singular method direct using lambda
        // obj.show(5);
    }
}