package bookPractice.threadPractice;

import java.util.concurrent.TimeUnit;

public class WaitingForThreadToBeFinishedDemo {
    private static boolean doneWorking = false;

    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            findTheTop20FibonacciNumber();
            doneWorking = true;
        });
        thread.start();
        try {
            TimeUnit.MILLISECONDS.sleep(500);
            if(doneWorking){
                System.out.println("Thread has been finished the work");
            }else {
                System.out.println("Thread has not finished the work");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void findTheTop20FibonacciNumber() {
        for(int i=1;i<=20;i++){
            System.out.println(fib(i)+",");
        }
    }

    private static int fib(int i) {
        if(i==1 || i == 2){
            return 1;
        }
        return fib(i-1)+fib(i-2);
    }
}
