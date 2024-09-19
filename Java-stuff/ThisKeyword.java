class Human
{
    private int age;  //Private means this is accessible in the same class
    private String name = "Liam";  //Instance variables should be private
    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        this.age = a;  //Local variable, this keyword refers to the class variable to eliminate confusion, this.age = 0, then set to value "a"
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
        //use Rightclick source action create getters and setters
    
}
public class ThisKeyword {
    public static void main(String a[]){
        Human obj = new Human();
        obj.setAge(25);
        obj.setName("Liam2");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
