import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedReader {
    public static void main(String a[]){
        // try {
        //     int num = System.in.read();
        //     System.out.println(num);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);

    }
    
}
