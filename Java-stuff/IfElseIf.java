public class IfElseIf {
    public static void main(String[] args){

        int x = 8;
        int y = 17;
        int z = 9;

        if (x>y && x>z)
        {
            System.out.println(x);
        }
        else if(y>z)
        {
            System.out.println(y);
        }
        else
        {
            System.out.println(z);
        }

        //result = n%2=0?10:20; ternary operator - n%2==0 condition, ? = if, x:x = true:false (10 true 20 fales)
    }
}
