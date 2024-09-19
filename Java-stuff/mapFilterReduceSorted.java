import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class mapFilterReduceSorted {
    public static void main(String a[]){
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Predicate<Integer> p = n -> n%2==0;

        Function<Integer, Integer> func = n -> n*2;



        int result = nums.stream()  
                    .filter(p)
                    .map(func)
                    .reduce(0, (c,e) -> c+e);

        Stream<Integer> sortedValues = nums.stream()  
                    .filter(n -> n%2==0)
                    .sorted();

        sortedValues.forEach(n -> System.out.println(n));
    }
}
