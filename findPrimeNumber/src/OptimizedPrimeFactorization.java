public class OptimizedPrimeFactorization implements Runnable{
    public OptimizedPrimeFactorization() {
    }

    @Override
    public void run(){
        int count = 0;
        int num = 2;
        while(count < 10){
            if (OptimizedCheckPrime(num)){
                System.out.println("Print prime number "+num+" from optimized thread");
                count ++;
            }
            num++;
        }
    }


    public static boolean OptimizedCheckPrime(int num){
        if (num < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }
}
