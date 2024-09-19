import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class forEach {
    public static void main(String a[]){
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);


        // Consumer<Integer> con = new Consumer<Integer>(){
        //     public void accept(Integer n){
        //         System.out.println(n);
        //     };
        // }; //Consumer is a functional interface
        
        Consumer<Integer> con = (Integer n) -> System.out.println(n);
        
        nums.forEach(con);

        nums.forEach(n -> System.out.println(n));
    }
}
