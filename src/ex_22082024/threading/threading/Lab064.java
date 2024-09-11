package ex_22082024.threading.threading;

public class Lab064 {
    public static void main(String[] args) {
        Runnable w1 = new WorkersThread();
        Thread t1 = new Thread(w1);
        t1.start();

        Runnable w2 = new WorkersThread();
        Thread t2 = new Thread(w1);
        t2.start();


        for (int i = 0; i < 5; i++) {

            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class WorkersThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
