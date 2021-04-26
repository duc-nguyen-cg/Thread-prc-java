public class OddThread extends Thread{
    public OddThread() {
    }

    @Override
    public void run(){
        try {
            for (int i = 1; i <= 10; i+= 2){
                System.out.println("Print number "+ i);
                Thread.sleep(10);
            }
        } catch (InterruptedException e){
            System.err.println("OddThread is interrupted!");
        }
        System.out.println("OddThread is run over");
    }
}
