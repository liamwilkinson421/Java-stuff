

class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj){
        System.out.println("In static method");
        //System.out.println(brand + " : " + price + " : " + name); //can use static variable in static method, cannot use non static variable in static method
        System.out.println(obj.brand + " : " + obj.price + " : " + name); //You can with object reference, however

    }
}


public class StaticMethod{
    public static void main(String a[]){

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "Phone";

        obj1.show();
        //Mobile.show(); //cannot make a static ref to a non static method
        Mobile.show1(obj1); //can make a static ref to a non static method with the classname, can call static method directly with classname without object

    }
}
