

public class ThreadImplements implements Runnable { 
    
    public ThreadImplements() {
        Thread thread = new Thread(this);
    }

    @Override
    public void run() {
    
        for(int i = 1; i < 11; i++ ){
            System.out.println(i + " Implements");
        }
    }

}
