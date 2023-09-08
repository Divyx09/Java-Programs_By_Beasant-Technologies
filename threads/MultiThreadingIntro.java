package threads;


class InnerMultiThreadingIntro extends Thread{
    public void run() {
        System.out.println("Thread Number Two");
    }

}
class InnerMultiThreadingIntro_1 extends Thread{
    public void run(){
        System.out.println("Thread Number Three");
    }
}
class InnerMultiThreadingIntro_2 extends Thread{
    public void run(){
        System.out.println("Thread Number Three");
    }
}

public class MultiThreadingIntro {
   public static void main(String[] args) {
    InnerMultiThreadingIntro thread1 = new InnerMultiThreadingIntro();
    InnerMultiThreadingIntro_1 thread2 = new InnerMultiThreadingIntro_1();
    InnerMultiThreadingIntro_2 thread3 = new InnerMultiThreadingIntro_2();

    thread1.start();
    thread2.start();
    thread3.start();
   }        
}