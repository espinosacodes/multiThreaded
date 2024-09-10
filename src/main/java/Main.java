public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        /* 
        Thread threadImplements = new Thread(new ThreadImplements());
        ThreadExtends threadExtends = new ThreadExtends();

        threadImplements.start();
        threadExtends.start();

        threadImplements.join();
        threadExtends.join();*/

        Thread car = new Thread(new Car());
        RacingCar racingCar = new RacingCar();

        car.start();
        racingCar.start();

        car.join();
        racingCar.join();


    }
}