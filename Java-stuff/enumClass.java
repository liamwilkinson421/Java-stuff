enum Laptop{ //cant extend enum with any other class, but works otherwise like any other class
    Macbook(2000), XPS(2200), Surface(1500), Thinkpad(800);

    private int price;

    private Laptop(int price) { //Constructor generated
        this.price = price;
    }

    public int getPrice() {  //Getters & Setters Generated
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}

public class enumClass {
    public static void main(String a[]){
        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap + " : " + lap.getPrice());

        for(Laptop lap : Laptop.values()){
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}
