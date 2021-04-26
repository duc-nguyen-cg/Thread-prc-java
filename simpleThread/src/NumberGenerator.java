public class NumberGenerator implements Runnable{
    public NumberGenerator() {
    }

    @Override
    public void run(){
        try {
            for (int i = 1; i <= 10; i++){
                System.out.println("Print number "+ i+ ", hashcode = "+this.hashCode());
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            System.err.println("This thread is interrupted!");
        }
        System.out.println("My thread is run over");
    }
}
