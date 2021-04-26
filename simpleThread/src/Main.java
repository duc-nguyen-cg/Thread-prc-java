public class Main {
    public static void main(String[] args) {
        //create thread that runs NumberGenerator
        Thread thread1 = new Thread(new NumberGenerator());
        Thread thread2 = new Thread(new NumberGenerator());
        //set priority
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        //run
        thread1.start();
        thread2.start();
    }
}
