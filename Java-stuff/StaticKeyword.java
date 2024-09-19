class Mobile
{
    String brand;
    int price;
    static String name;  //static means common to all objects, a constant

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class StaticKeyword {
    public static void main(String[] args){

        Mobile.name = "Phone"; //Setting static variable by calling classname

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1500;
        //obj2.name = "Smartphone";

        Mobile obj3 = new Mobile();
        obj3.brand = "Google";
        obj3.price = 1500;
        //obj3.name = "Smartphone";

        obj1.show();
        obj2.show();
        obj3.show();
    }
}
