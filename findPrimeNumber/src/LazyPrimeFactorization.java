public class LazyPrimeFactorization implements Runnable{
    public LazyPrimeFactorization() {
    }

    @Override
    public void run(){
        int count = 0;
        int num = 2;

        while(count < 10) {
            if (LazyCheckPrime(num)) {
                System.out.println("Print prime number " + num+ " from lazy thread");
                count++;
            }
            num++;
        }
    }

    public static boolean LazyCheckPrime(int num){
        if (num < 2){
            return false;
        }
        for (int i = 2; i < num; i++){
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }
}
