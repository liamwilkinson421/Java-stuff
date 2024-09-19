class Mobile{
    String brand;
    int price;
    static String name;

    static  //Static block called only once, allows instantiation of variables without having to do it every single time as constants, calls first
    {
        name = "Phone";
        System.out.println("In static block");
    }

    public Mobile(){ //Constructor with defualt values
        brand = "";
        price = 200;
        System.out.println("In constructor");
    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }


}

public class StaticBlock {
    public static void main(String a[]){

        //Class.forName("Mobile"); //Load class and call a static block

        Mobile obj1 = new Mobile();
        obj1.brand = "Google";
        obj1.price = 1500;
        Mobile.name = "Phone";
    }
}
