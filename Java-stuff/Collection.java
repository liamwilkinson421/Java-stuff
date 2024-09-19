import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;

//Map is a key:value pair data structure, a collection of key:value pairs to identify data, Map is an interface
//Iterable 
//Collection API
//Collection (interface)
//Collections (class)
//Stack = LIFO (Last in first out)
//Queue = FIFO (First in first out)
//Collections = a kind of dynamic array using collections API
//List -> ArrayList/LinkedList
//Queue -> De-queue
//Set -> HashSet/LinkedHashSet

public class Collection {
    public static void main(String a[]){

        ArrayList<Integer> col = new ArrayList<Integer>();
        // col.add(6);
        // col.add(5);
        // col.add(8);
        // col.add(2);

        // System.out.println(col);

        // for(int n : col){
        //     System.out.println(n);
        // }


        // for(Object n : col){
        //     int num = (Integer)n;
        //     System.out.println(num*2);
        // }

        // Set<Integer> nums = new TreeSet<Integer>(); //TreeSet sorts the set

        // //Set<Integer> nums = new HashSet<Integer>(); //Set does not support index value, a collection of unique values
        // nums.add(15);
        // nums.add(11);
        // nums.add(7);
        // nums.add(8);

        // Iterator<Integer> values = nums.iterator();

        // //values.next(); //gives next element from Iterator

        // while(values.hasNext()){ //while the values Iterator has another value
        //     System.out.println(values.next());
        // }

        // for(int n : nums){
        //     System.out.println(n);
        // }
        // put = try to add, if already present, replace
        // Hashtable = synchronized hashmap, to work on one thread at a time
    
        Map<String, Integer> students = new HashMap<>(); //Keys are unique in the key:value pair, cannot be repeated, maps are a Set:List combination (key:value)
        
        for (int i=0;i<5;i++){
            students.put("Liam"+i,10+i);
        }

        // students.put("Liam", 60);
        // students.put("Laim", 35);
        // students.put("Mail", 30);
        // students.put("Ilam", 80);
        // students.put("Liam", 45);

        //students.remove(key);
        
        for(String name : students.keySet()){
            System.out.println(name + " : " + students.get(name));
        }

        System.out.println(students);
        System.out.println(students.get("Liam0"));

    


    }
}
