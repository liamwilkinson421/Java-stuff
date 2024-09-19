import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamAPI {
    public static void main(String a[]){
        List<Integer> nums = Arrays.asList(4,6,1,9,3,8,2,5);

        // Stream<Integer> s1 = nums.stream(); //returns an object of Stream, if you affect the Stream object it will NOT affect the array(nums)
        // // s1.forEach(n -> System.out.println(n)); //Can only use stream once on runtime
        // Stream<Integer> s2 = nums.stream();
        // s2.filter(n -> n%2==0); //Returns only even values from the stream 
        // Stream<Integer>s3 = s1.map(n -> n*2);
        // //Stream //Stream is an interface

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int result = s3.reduce(0, (c,e) -> c+e);


        int result = nums.stream().filter(n -> n%2==0).map(n ->n*2).reduce(0, (c,e) -> c+e);
        System.out.println(result);

        // for(int n : nums){
        //     System.out.println(n);
        // }

        //nums.forEach(n -> System.out.println(n));
        // int sum = 0;
        // for(int n : nums){
        //     if(n%2==0){
        //         n = n*2;
        //         sum = sum + n;
        //     }
        // }

        //System.out.println(nums);
        // System.out.println(sum);

        
    }
}
