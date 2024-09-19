
// class A implements Runnable{
//     public void run(){
        // for(int i=1;i<=100;i++){
        //     System.out.println("hi");
        //     try{
        //         Thread.sleep(100);
        //     } catch(InterruptedException e){e.printStackTrace();}
        // }
//     }
// }

class B implements Runnable{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("hi B");
            try{
                Thread.sleep(100);
            } catch(InterruptedException e){e.printStackTrace();}
        }
    }
}

public class threadRunnable {
    public static void main(String a[]){
        //A obj1 = new A();
        B obj2 = new B();

        Runnable obj1 = () ->{  //Converting to lambda because Runnable is a functional interface(one method)
            for(int i=1;i<=100;i++){
                System.out.println("hi");
                try{
                    Thread.sleep(100);
                } catch(InterruptedException e){e.printStackTrace();}
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        
        t1.getPriority();
        t2.getPriority(); //Find thread priority (1-10 least-max, 5 is default (normal))
        t1.setPriority(10); //Set priority

        t1.start();
        t2.start();
    }
}
