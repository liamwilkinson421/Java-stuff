class Human
{
    private int age = 24;  //Private means this is accessible in the same class
    private String name = "Liam";  //Instance variables should be private

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        age = a;
    }

    public void setName(String s){
        name = s;
    }
    public String getName(){
        return name;
    }

}
public class Encapsulation {
    public static void main(String a[]){
        Human obj = new Human();
        obj.setAge(25);
        obj.setName("Liam2");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
