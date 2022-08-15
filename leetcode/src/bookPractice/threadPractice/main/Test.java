package bookPractice.threadPractice.main;

import bookPractice.threadPractice.CheckCricInfo;

import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        CheckCricInfo checkCricInfo = new CheckCricInfo();
        checkCricInfo.start();;
        try{
            TimeUnit.MINUTES.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        checkCricInfo.shutdown();

    }
}
