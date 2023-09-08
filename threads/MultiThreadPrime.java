package threads;

public class MultiThreadPrime {
public static void main(String[] args) {
    InnerMultiThreadPrime thread = new InnerMultiThreadPrime();
    Thread t =new  Thread(thread);
    t.start();
    try {
        t.join();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}

class InnerMultiThreadPrime extends Thread{
    public synchronized void run() {
        String pm = "";
        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int n = i; n >= 1; n--) {
                if (i % n == 0) {
                    count = count + 1;
                }
            }
            if (count == 2) {
                pm = pm + i + " ";
            }
        }
        System.out.println("Prime Numbers 1 to 100:\n"+pm);
    }
}
