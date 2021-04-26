public class TestThread {
    public static void main(String[] args) {
        Thread slowThread = new Thread(new LazyPrimeFactorization());
        Thread fastThread = new Thread(new OptimizedPrimeFactorization());

        slowThread.start();
        fastThread.start();
        //the thread that uses optimized algorithm usually finish first
    }
}
