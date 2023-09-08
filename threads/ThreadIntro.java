package threads;

public class ThreadIntro extends Thread {
    public void run() {
        System.out.println("Thread number " + Thread.currentThread().getId() + " is running");
    }

    public static void main(String[] args) {
        int i = 8;
        for (int j = 0; j < i; j++) {
            ThreadIntro thread = new ThreadIntro();
            thread.start();
        }
    }
}
