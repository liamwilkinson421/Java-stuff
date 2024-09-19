enum Status{ //Status is an enum class
    Running, Failed, Pending, Success; //These are objects, named constants
}

public class Enum {
    public static void main(String a[]){

        // Status[] ss = Status.values(); //Gives an array of values
        // System.out.println(ss[0]);
        // //System.out.println(s.ordinal()); //grabs index of the list, Running = 0 for example

        // for(Status s : ss){
        //     System.out.println(s + " : " + s.ordinal());
        // }

        Status s = Status.Success;
        if(s == Status.Running){
            System.out.println("Good");
        }
        else if( s==Status.Failed){
            System.out.println("No good");
        }
        else if(s ==Status.Pending){
            System.out.println("Please wait");
        }
        else {
            System.out.println("Done");
        }

        switch(s){
            case Running -> System.out.println("Running");
            case Failed -> System.out.println("No good");
            case Pending -> System.out.println("Please wait");
            default -> System.out.println("Done");
        }
    }
    
}
