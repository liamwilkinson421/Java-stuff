public class Strings {
    public static void main(String[] args){

        String name = "Liam"; //incorrect syntax
        String name2 = new String("Liam"); //correct syntax


        System.out.println("hello " + name2);
        System.out.println(name.charAt(1));
        System.out.println(name.concat(name2 + " concat"));
    }
    
}
