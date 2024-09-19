class Computer{

    public void playMusic(){
        System.out.println("Music Playing...");

    }

    public String getMeAPen(int x){
        if (x>=10){
            return "Pen";
        }
        return "Not enough money";
    }
}

public class Methods {
    
    public static void main(String[] args) {
        

        Computer obj = new Computer();

        obj.playMusic();

        String str = obj.getMeAPen(10);
        System.out.println(str);


    }
}
