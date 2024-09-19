//Thread safe means one thread can work with the subject at one point (Only one thread can execute a method at a time

// class B implements Runnable{
//     public void run(){
//         for(int i=1;i<=100;i++){
//             System.out.println("hi B");
//             try{
//                 Thread.sleep(100);
//             } catch(InterruptedException e){e.printStackTrace();}
//         }
//     }
// }

class Counter
{
    int count;
    public synchronized void increment(){  //makes method thread-safe, only allows one thread to use the method (synchronized keyword)
        count++;
    }
}
public class raceCondition {
    public static void main(String a[]) throws InterruptedException{
        //A obj1 = new A();
        //B obj2 = new B();

        Counter c = new Counter();

        Runnable obj1 = () ->{  //Converting to lambda because Runnable is a functional interface(one method)
            for(int i=1;i<=1000;i++){
                c.increment();
            }
        };

    
        Runnable obj2 = () ->{  //Converting to lambda because Runnable is a functional interface(one method)
            for(int i=1;i<=1000;i++){
                c.increment();
            }
        };    

        

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        
        System.out.println(c.count);
    }
}

