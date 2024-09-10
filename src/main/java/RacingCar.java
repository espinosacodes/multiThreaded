//random
import java.util.Random;

public class RacingCar extends Thread{
    Random random = new Random();
    Thread thread;

    public RacingCar(){
        this.thread = new Thread(this);
    }

    @Override
    public void run() {
        
        for (int i = 0; i < 100; i++){
            System.out.println(i);
            try{
                this.thread.sleep(random.nextLong(100, 500));
            }catch(InterruptedException e){
                System.err.println(e);
            }

            if(i == 99){
                System.out.println(
                    "RacingCar termina la carrera"
                );
            }
            
        }
    }

    
}
