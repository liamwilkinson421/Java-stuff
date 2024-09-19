@SuppressWarnings //hides warnings annotation
@Deprecated //Deprecation signposting annotation
class A{
    public void showDataWhichBelongsToThisClass(){
        System.out.println("Show A");
    }
}
class B extends A{
    @Override //Annotation to show that youre trying to override a method, lets compiler help debug
    public void showDataWhichBelongToThisClass(){ //see error that Override provides
        System.out.println("Show B");
    }
}

public class Annotations {
    public static void main(String a[]){
        B obj = new B();
        obj.showDataWhichBelongsToThisClass();
    }
}
