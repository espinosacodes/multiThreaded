
import java.util.Random;
public class Car implements Runnable {
    
    public Random random = new Random();
    
    public Thread thread;
    public Car(){
        this.thread = new Thread(this);
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++){
            System.out.println("\u001B[32m" + i + "\u001B[0m"); // print color green on terminal

            try{
                this.thread.sleep(random.nextLong(100, 500));
            }catch(InterruptedException e){
                System.err.println(e);
            }

            if(i == 99){
                System.out.println(
                    "Car termina la carrera"
                );
            }
            
        }
    }




    
}
