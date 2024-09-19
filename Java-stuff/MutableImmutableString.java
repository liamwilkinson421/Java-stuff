public class MutableImmutableString {
    public static void main(String[] args){

        String name = "Liam"; //incorrect syntax
        String name2 = new String("Liam"); //correct syntax

        //strings created are strings constant, located in constant pool

        String s1 = new String("Liam");
        String s2 = new String("Wilkinson");

        System.out.println("hello " + name2);

        //Mutable strings are changeable - StringBuffers and StringBuilders are mutable
        //Immutable strings are not changeable - Strings by default
    }
    
}