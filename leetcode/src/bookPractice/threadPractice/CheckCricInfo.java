package bookPractice.threadPractice;

import java.util.concurrent.TimeUnit;

public class CheckCricInfo extends Thread{
    private volatile boolean keepChecking = true;

    @Override
    public void run() {
        while (keepChecking){
            checkScoreAndPrintResult();
            try{
                TimeUnit.MINUTES.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void checkScoreAndPrintResult() {
        System.out.println(
                "Current score is: BAN 125/2 (10 ov. target 220)"
        );
    }
    public void shutdown(){
        this.keepChecking = false;
    }
}
