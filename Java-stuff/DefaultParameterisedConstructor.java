class Human
{
    private int age;  //Private means this is accessible in the same class
    private String name;  //Instance variables should be private 

    // public Human(){  //Default Constructor
    //     age = 12;
    //     name = "Liam";
    //     System.out.println("In constructor");        
    // } 

    // public Human(int a, String n){  //Parameterised Constructor
    //     age = a;
    //     name = n; 
    // }

    

    public int getAge() {
        return age;
    }

    public Human(){
        age = 16;
        name = "Liam";
    }
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
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
public class DefaultParameterisedConstructor {
    public static void main(String a[]){
        Human obj = new Human();
        Human obj1 = new Human(17, "Liam"); //Set parameters for the parameterised constructor

        // obj.setAge(25);
        // obj.setName("Liam2");

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
        

    }
}
