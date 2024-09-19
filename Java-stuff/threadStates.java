//Every time you call a new thread it goes into New state
//Runnable state -> start() = Runnable state, waiting for the scheduler
//Running state = when the thread is actually running on the CPU
//Waiting state = put thread on hold, for example using sleep() or wait(), come back to runnable state with notify()
//Dead state - use stop() method to kill thread, however should not use as deprecated, will go to dead automatically when finished

public class threadStates {
    public static void main(String a[]){

    }
}
