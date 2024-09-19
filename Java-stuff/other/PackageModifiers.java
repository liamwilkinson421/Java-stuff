package other;

public class PackageModifiers {
    int marks = 6;
    public void show(){
        System.out.println("Show");
    }
}

//Make classes public, one file to one class
//Keep instance variables private
//Avoid default in general
//Public open to anything
//Private open to the same class, nothing else
//Default open to the files in the same package
//Protected cant be used outside of package, but can be used outside of package if subclass and inherited (extends)