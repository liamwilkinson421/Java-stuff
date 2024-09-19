import java.io.InputStreamReader;
import java.io.BufferedReader;

public class tryWith {
    public static void main(String a[]){
        int i = 1;
        int j = 1;
        int num = 0;
        BufferedReader br = null;
        try{
            j = 10/i;
            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);
            num = Integer.parseInt(br.readLine());
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally{ //No matter of exception or not, always do finally
            System.out.println("Always here");
        }
    }
}
