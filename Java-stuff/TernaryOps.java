public class TernaryOps {
    public static void main(String[] args){

        int n = 4;
        int result = 0;

        // if(n%2==0){  //Divisible by 2
        //     result = 10;
        // }
        // else
        // {
        //     result = 20;
        // }

        // ?: = ? IF IT IS TRUE : IF IT IS FALSE if n%2==0 is TRUE, then use ? value, if FALSE use : value
        result = n%2==0 ?10:20;

        System.out.println(result);

    }
}
