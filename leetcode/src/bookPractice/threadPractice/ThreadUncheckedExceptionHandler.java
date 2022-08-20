package bookPractice.threadPractice;

import java.util.concurrent.TimeUnit;

public class ThreadUncheckedExceptionHandler {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    TimeUnit.SECONDS.sleep(5);
                }catch (InterruptedException e){
                    System.out.println("thread interrupted deu to "+e.getMessage());
                }
                throw new RuntimeException("Good bye cruel world");
            }
        });
        thread.setUncaughtExceptionHandler(new CustomUncaughtExceptionHandler());
        thread.start();
    }
}
