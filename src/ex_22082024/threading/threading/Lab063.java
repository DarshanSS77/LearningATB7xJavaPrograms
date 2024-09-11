package ex_22082024.threading.threading;

public class Lab063 {

    //1-10





    public static void main(String[] args) {

        Worker w1 = new Worker();
        Worker w2 = new Worker();

        w1.start();
        w2.start();


        for (int i = 0; i<5 ; i++){
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

class Worker extends Thread{
    @Override
    public void run() {
        for (int i = 0; i<5 ; i++){
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

