interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Code and stuff");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Code and stuff on desktop");
    }
}

class Developer{
    public void devApp(Computer lap){
        lap.code();
    }
}

public class interfaceNeed {
    public static void main(String a[]){
        Developer liam = new Developer();
        Desktop desk = new Desktop();
        Laptop lap = new Laptop();
        liam.devApp(desk);
    }
}
