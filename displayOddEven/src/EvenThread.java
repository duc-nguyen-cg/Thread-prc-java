public class EvenThread extends Thread{
    public EvenThread() {
    }

    @Override
    public void run(){
        try {
            for (int i = 2; i <= 10; i += 2){
                System.out.println("Print number "+i);
                Thread.sleep(15);
            }
        } catch (InterruptedException e){
            System.err.println("EvenThread is interrupted!");
        }
        System.out.println("EvenThread is run over");
    }
}
