import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

//Comparator is used by Collections.sort(x, comparator), comparator allows to specify own logic to sort list
class Student implements Comparable<Student>{
    int age;
    String name;

    public int compareTo(Student that){
        return 0;
    }
    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [name=" + name + "]";
    }

    
}
public class CvsC{
    public static void main(String a[]){
        List<Student> nums = new ArrayList<>();{
            
            Comparator<Student> com2 = (Student i, Student j) ->
            {
                return i.age > j.age?1:-1; //If i is greater than j, higher index (1), if it is lower, lower index (-1)
            };

            // Comparator<Integer> com = new Comparator<Integer>()
            // {
            //     public int compare(Integer i, Integer j){
            //         if(i%10 > j%10){
            //             return 1;
            //         }else{
            //             return -1;
            //         }
            //     }
            // };

            Comparator<Student> com = new Comparator<Student>()
            {
                public int compare(Student i, Student j){
                    if(i.age > j.age){
                        return 1;
                    }else{
                        return -1;
                    }
                }
            };

            nums.add(new Student(21, "Liam"));
            nums.add(new Student(73, "Liam2"));
            nums.add(new Student(40, "NotLiam"));
            nums.add(new Student(73, "Burg"));
            Collections.sort(nums, com); //Sort collection based on comparator's logic (com)
            // Collections.sort(nums);
            for (Student s : nums)
                System.out.println(s.age);
            System.out.println(nums);
        }
    }
}