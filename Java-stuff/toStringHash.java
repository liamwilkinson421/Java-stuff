class A{
    int price;
    String brand;

    public String toString(){
        return brand + " : " + price + "Hey";
    }


    //Source actions -> Generate equals and hashCode();

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode()); //hashCode algorithm
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        A other = (A) obj;
        if (price != other.price)
            return false;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        return true;
    }
    
}

public class toStringHash {
    public static void main(String a[]){
        A obj = new A();
        obj.brand = "HP";
        obj.price = 1111;

        A obj1 = new A();
        obj1.brand = "HP";
        obj1.price = 1111;

        boolean result = obj.equals(obj1);

        System.out.println(obj);
        System.out.println(result);
    }
}
