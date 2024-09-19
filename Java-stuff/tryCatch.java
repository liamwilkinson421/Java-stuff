class newException extends Exception{ //Custom exception
    public newException(String string){
        super(string);
    }
}

//throws Exception makes the parent class handle the exception if labelled on a method under a class (Throw it to the next place to handle)
public class tryCatch{
    public static void main(String a[]){
        int i = 0;
        int j = 10;

        try
        {
            j = 19/i;
            if(j==0)
            throw new newException("new new new new");
        }
        catch(ArithmeticException e)
        {
            // System.out.println("Handled exception" + e);
            j = 189/1;
        }
        catch(Exception e){
            System.out.println("Exception");
        }
        System.out.println(j);
    }
}