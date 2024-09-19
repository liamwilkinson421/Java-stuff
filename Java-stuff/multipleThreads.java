class A extends Thread{
    public void run(){
        for (int i=1; i<=100; i++){
            System.out.println("Thread 1");
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=1; i<=100; i++){
            System.out.println("Thread 2");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class multipleThreads {
    public static void main(String a[]){
        A obj1 = new A();
        B obj2 = new B();

        System.out.println(obj1.getPriority());
        obj2.setPriority(10);
        System.out.println(obj2.getPriority());
        obj1.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        obj2.start();
    }
}
