package bookPractice.threadPractice;

public class CustomUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("Exception has been thrown from "+t.getName());
        System.out.println("Exception message "+e.getMessage());
    }
}
