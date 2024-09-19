class Human
{
    private int age = 24;  //Private means this is accessible in the same class
    private String name = "Liam";  //Instance variables should be private
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
public class GettersAndSetters {
    public static void main(String a[]){
        Human obj = new Human();
        obj.setAge(25);
        obj.setName("Liam2");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
