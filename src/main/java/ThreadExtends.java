
public class ThreadExtends extends Thread {

    public ThreadExtends(){
        Thread thread = new Thread(this);
    }
    
    @Override
    public void run() {
        
        for(int i = 1; i < 11; i++ ){
            System.out.println(i + " Extends");
            
        }
    }
    
}
