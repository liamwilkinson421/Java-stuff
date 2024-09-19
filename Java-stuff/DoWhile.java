public class DoWhile {
    public static void main(String[] args){

        int i = 0;
        // do
        // {
        //     System.out.println("Hi " + i);
        //     i++;
        // }while(i<=4);

        while(i<=4){
            System.out.println("Hi While " + i);
            i++;
        }
        
        //doWhile executes the loop logic at least once before checking the statement, While checks the statement first before executing any logic
    }
}
