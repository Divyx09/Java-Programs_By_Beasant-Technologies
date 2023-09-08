package threads;

public class ThreadRunnable implements Runnable{
    public void run (){
        try {
            
            System.out.println("Thread number"+Thread.currentThread().getId()+" is running");
        } catch (Exception e) {
            System.out.println("Exception Caught");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            Thread thread = new Thread(new ThreadRunnable());
            thread.start();
        }
    }
}
