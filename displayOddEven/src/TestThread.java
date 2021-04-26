public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        oddThread.start();
        try {
            oddThread.join();  //Thread main will wait until the oddThread is finished
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        evenThread.start();
    }
}
