public class IfElse{
    public static void main(String[] args) {
        int x = 15;

        if(x>10){
            System.out.println("Hello");
        }
        
        if(x>10 && x<20){
            System.out.println("HelloHello");
        }
        else{
            System.out.println("Bye");
        }

        int y = 7;
        int z = 9;
        int result = 0;

        if(y>z){
            result = y;
            System.out.println(result);
        }
        else{
            result = z;
            System.out.println(result);
        }

    }
}