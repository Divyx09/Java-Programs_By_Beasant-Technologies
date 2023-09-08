package threads.threadPriority;

public class ThreadPriorityIntro extends Thread{
    public void run(){
        System.out.println("Numbers Of threads");
    }

    public static void main(String[] args) {
        ThreadPriorityIntro thread1 = new ThreadPriorityIntro();
        ThreadPriorityIntro thread2 = new ThreadPriorityIntro();
        ThreadPriorityIntro thread3 = new ThreadPriorityIntro();

        System.out.println("Thread "+thread1.getPriority());
        System.out.println("Thread "+thread2.getPriority());
        System.out.println("Thread "+thread3.getPriority());
        System.out.println();
        
        thread1.setPriority(6);
        thread2.setPriority(2);
        thread3.setPriority(9);
        
        System.out.println("Thread "+thread1.getPriority());
        System.out.println("Thread "+thread2.getPriority());
        System.out.println("Thread "+thread3.getPriority());

        System.out.println("Running Thread "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("Running Thread "+Thread.currentThread().getPriority());
        
    }
}
