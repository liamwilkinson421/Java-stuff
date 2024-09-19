class Human
{
    private int age;  //Private means this is accessible in the same class
    private String name;  //Instance variables should be private 

    public Human(){  //Constructor example - setting variables for the class, specify access (public) and then constructor name (usually same as classname: Human)
        age = 12;
        name = "Liam";
        System.out.println("In constructor");        
    } //Every time the object is created the constructor will be called

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
        //use Rightclick source action create getters and setters
    
}
public class Constructors {
    public static void main(String a[]){
        Human obj = new Human();
        Human obj1 = new Human();
        obj.setAge(25);
        obj.setName("Liam2");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
